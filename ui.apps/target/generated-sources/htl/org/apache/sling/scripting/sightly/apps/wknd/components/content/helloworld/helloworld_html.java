/*******************************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 ******************************************************************************/
package org.apache.sling.scripting.sightly.apps.wknd.components.content.helloworld;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class helloworld_html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _dynamic_properties = bindings.get("properties");
Object _dynamic_hello = bindings.get("hello");
Object _global_hello = null;
out.write("\r\n");
{
    Object var_testvariable0 = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "text");
    if (renderContext.getObjectModel().toBoolean(var_testvariable0)) {
        out.write("<p>");
        {
            String var_1 = ("Text property: " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "text"), "text")));
            out.write(renderContext.getObjectModel().toString(var_1));
        }
        out.write("</p>");
    }
}
out.write("\r\n\r\n");
{
    String var_2 = (("<!-- \r\n<sly data-sly-use.hello=\"com.models.UserInfo\">\r\nHelloWorldModel says:\r\n" + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_hello, "name"), "comment"))) + "\r\n</sly>\r\n -->");
    out.write(renderContext.getObjectModel().toString(var_2));
}
out.write("\r\n\r\n\r\n");
_global_hello = renderContext.call("use", apps.sling.components.HelloWorld.class.getName(), obj());
{
    String var_3 = (("\r\nHelloWorldModel says:\r\n" + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_hello, "description"), "text"))) + "\r\n");
    out.write(renderContext.getObjectModel().toString(var_3));
}
out.write("\r\n<br/>\r\nEnd of HelloWorld");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

