/*
 * Copyright 2008-2009 the original 赵永春(zyc@hasor.net).
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
package net.hasor.core.environment;
import java.util.Set;
import net.hasor.core.Environment;
import net.hasor.core.EventContext;
import net.hasor.core.Settings;
/**
 * {@link Environment}接口包装器。
 * @version : 2013-9-11
 * @author 赵永春(zyc@hasor.net)
 */
public class EnvironmentWrap implements Environment {
    private final Environment environment;
    public EnvironmentWrap(Environment environment) {
        this.environment = environment;
    }
    //
    protected Environment getEnvironment() {
        return environment;
    }
    //
    @Override
    public String[] getSpanPackage() {
        return this.getEnvironment().getSpanPackage();
    }
    @Override
    public Set<Class<?>> findClass(Class<?> featureType) {
        return this.getEnvironment().findClass(featureType);
    }
    @Override
    public boolean isDebug() {
        return this.getEnvironment().isDebug();
    }
    @Override
    public Object getContext() {
        return this.getEnvironment().getContext();
    }
    @Override
    public EventContext getEventContext() {
        return this.getEnvironment().getEventContext();
    }
    @Override
    public String getPluginDir(Class<?> pluginType) {
        return this.getEnvironment().getPluginDir(pluginType);
    }
    @Override
    public String getWorkSpaceDir() {
        return this.getEnvironment().getWorkSpaceDir();
    }
    @Override
    public Settings getSettings() {
        return this.getEnvironment().getSettings();
    }
    @Override
    public String evalString(String eval) {
        return this.getEnvironment().evalString(eval);
    }
    @Override
    public String envVar(String varName) {
        return this.getEnvironment().envVar(varName);
    }
    @Override
    public void addEnvVar(String varName, String value) {
        this.getEnvironment().addEnvVar(varName, value);
    }
    @Override
    public void remoteEnvVar(String varName) {
        this.getEnvironment().remoteEnvVar(varName);
    }
    @Override
    public void refreshVariables() {
        this.getEnvironment().refreshVariables();
    }
}