package com.xyb.ai.service.impl;

import com.github.pagehelper.PageHelper;
import com.xyb.ai.mapper.ai.TUserMapper;
import com.xyb.ai.model.ai.TUser;
import com.xyb.ai.model.ai.TUserExample;
import com.xyb.ai.service.TUserService;
import com.xyb.common.PageInfo;
import com.xyb.common.util.U;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service(value = "TUserService")
@CacheConfig(cacheNames = "TUser")
public class TUserServiceImpl implements TUserService {

    @Autowired
    private TUserMapper tUserMapper;//这里会报错，但是并不会影响

//    @Autowired
//    private RedisTemplateUtil redisTemplateUtil;

    /*
     * 这个方法中用到了我们开头配置依赖的分页插件pagehelper
     * 很简单，只需要在service层传入参数，然后将参数传递给一个插件的一个静态方法即可；
     * pageNum 开始页数
     * pageSize 每页显示的数据条数
     * */
    @Override
    public List<TUser> findAllTUser() {
        TUserExample tUserExample = new TUserExample();
//        TUserExample.Criteria criteria = tUserExample.createCriteria();
//        criteria.andTUserIdEqualTo(1);
        return tUserMapper.selectByExample(tUserExample);
    }

    @Override
    public PageInfo<TUser> findByPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
//        redisTemplateUtil.set("a", "bbbb", 20);

        List<TUser> listTUser = tUserMapper.findByPage();
        PageInfo<TUser> pageInfoTUser = new PageInfo<>(listTUser);

        return pageInfoTUser;
    }

    @Override
    @Cacheable(key = "#userId", unless = "#result == null")
    public TUser selectByPrimaryKey(Integer userId) {
        return tUserMapper.selectByPrimaryKey(userId);
    }

    @Override
    @CacheEvict(key = "#userId")
    @Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED)
    public int deleteByPrimaryKey(Integer userId) {
        return tUserMapper.deleteByPrimaryKey(userId);
    }

    @Override
    @CachePut(key = "#result.userId", unless = "#result == null")
    @Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED)
    public TUser insertSelective(TUser record) {
        int count = tUserMapper.insertSelective(record);
        if (count == 0) {
            return null;
        }

        return record;
    }

    @Override
    @CachePut(key = "#record.userId", unless = "#result == null")
    @Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED)
    public TUser updateByPrimaryKey(TUser record) {
        int count = tUserMapper.updateByPrimaryKeySelective(record);
        if (count == 0) {
            return null;
        }

        return record;
    }

    //多条件查询，找出符合条件的记录
    @Override
    public PageInfo<TUser> findByCondition(TUser record, int pageNum, int pageSize) {
        TUserExample tUserExample = new TUserExample();
        TUserExample.Criteria criteria = tUserExample.createCriteria();

        tUserExample.setOrderByClause(" user_name desc");
        if (U.isNotBlank(record.getPassword())) {
            criteria.andPasswordEqualTo(record.getPassword());
        }

        if (U.isNotBlank(record.getPhone())) {
            criteria.andPhoneEqualTo(record.getPhone());
        }

        if (U.isNotBlank(record.getUserName())) {
            criteria.andUserNameEqualTo(record.getUserName());
        }

        PageHelper.startPage(pageNum, pageSize);
        List<TUser> listTUser = tUserMapper.selectByExample(tUserExample);
        PageInfo<TUser> pageInfoTUser = new PageInfo<>(listTUser);

        return pageInfoTUser;
    }
}
