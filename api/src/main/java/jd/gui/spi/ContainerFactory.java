/*
 * Copyright (c) 2008-2015 Emmanuel Dupuy
 * This program is made available under the terms of the GPLv3 License.
 */

package jd.gui.spi;

import jd.gui.api.API;
import jd.gui.api.model.Container;

import java.nio.file.Path;

public interface ContainerFactory {
	public String getType();
	
	public boolean accept(API api, Path rootPath);
	
	public Container make(API api, Container.Entry parentEntry, Path rootPath);
}
