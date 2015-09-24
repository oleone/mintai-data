package com.mintai.data.dal;

import com.mintai.data.biz.model.RealTimeSourceDO;
import org.springframework.stereotype.Repository;

/**
 * 文件描述：
 *
 * @author leiteng
 *         Date 2015/9/24.
 */
@Repository
public interface RealTimeSourceDao {
    long insert(RealTimeSourceDO sourceDO);
}
