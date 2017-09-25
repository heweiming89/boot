package io.heweiming.boot.generator.mybatis.util;

import org.junit.Assert;
import org.junit.Test;

import io.heweiming.boot.generator.mybatis.util.ConfigHelper;

import java.util.List;

/**
 * Created by zouzhigang on 2016/9/18.
 */
public class ConfigHelperTest {

    @Test
    public void testFindConnectorLibPath_Oracle() {
        String path = ConfigHelper.findConnectorLibPath("Oracle");
        Assert.assertTrue(path.contains("ojdbc"));
    }

    @Test
    public void testFindConnectorLibPath_Mysql() {
        String path = ConfigHelper.findConnectorLibPath("MySQL");
        Assert.assertTrue(path.contains("mysql-connector"));
    }

    @Test
    public void testFindConnectorLibPath_PostgreSQL() {
        String path = ConfigHelper.findConnectorLibPath("PostgreSQL");
        Assert.assertTrue(path.contains("postgresql"));
    }

    @Test
	public void testGetAllJDBCDriverJarPaths() {
    	List<String> jarFilePaths = ConfigHelper.getAllJDBCDriverJarPaths();
    	Assert.assertTrue(jarFilePaths != null && jarFilePaths.size() > 0);
    }
}