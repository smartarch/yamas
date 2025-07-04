/**
 * generated by Xtext 2.39.0-SNAPSHOT
 */
package com.mesev.dsl.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.mesev.dsl.XDSLRuntimeModule;
import com.mesev.dsl.XDSLStandaloneSetup;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class XDSLIdeSetup extends XDSLStandaloneSetup {
  @Override
  public Injector createInjector() {
    XDSLRuntimeModule _xDSLRuntimeModule = new XDSLRuntimeModule();
    XDSLIdeModule _xDSLIdeModule = new XDSLIdeModule();
    return Guice.createInjector(Modules2.mixin(_xDSLRuntimeModule, _xDSLIdeModule));
  }
}
