package cn.homjie.spi.impl.oracle;

import cn.homjie.spi.api.DataSource;

/**
 * Not Support Java SPI
 * 
 * @author HomJie
 *
 */
public class OracleDataSource implements DataSource {

	@Override
	public void connect() {
		System.out.println("Oracle connect");
	}

}
