package cn.homjie.spi.web;

import java.util.Iterator;
import java.util.ServiceLoader;

import cn.homjie.spi.api.DataSource;

/**
 * SPI Tutorial
 *
 */
public class App {

	public static void main(String[] args) {
		ServiceLoader<DataSource> loader = ServiceLoader.load(DataSource.class);
		Iterator<DataSource> iterator = loader.iterator();
		while (iterator.hasNext()) {
			DataSource source = iterator.next();
			source.connect();
		}
	}

}
