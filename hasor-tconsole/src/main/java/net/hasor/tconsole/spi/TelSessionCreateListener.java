/*
 * Copyright 2008-2009 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 * 提供一个工具，可以连接远端 tConsole 并执行指令。
 */
package net.hasor.tconsole.spi;
import net.hasor.tconsole.TelSession;

import java.util.EventListener;

/**
 * 当新的会话创建的时。
 * 提示：对于 Host 模式也会触发该SPI ，但是 Host 下只有一个 Session。
 * @version : 2019年10月30日
 * @author 赵永春 (zyc@hasor.net)
 */
@FunctionalInterface
public interface TelSessionCreateListener extends EventListener {
    /** Receives notification that a session has been created. */
    public void sessionCreated(TelSession telSession);
}