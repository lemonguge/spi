package cn.homjie.spi.impl.mysql;

import cn.homjie.spi.api.DataSource;

/**
 * Support Java SPI
 * 
 * @author HomJie
 *
 */
public class MysqlDataSource implements DataSource {

	@Override
	public void connect() {
		System.out.println("Mysql connect");
	}

}
