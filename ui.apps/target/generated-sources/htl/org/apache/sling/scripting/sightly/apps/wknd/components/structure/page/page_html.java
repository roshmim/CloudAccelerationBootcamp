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
package org.apache.sling.scripting.sightly.apps.wknd.components.structure.page;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class page_html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _dynamic_currentpage = bindings.get("currentpage");
out.write("\r\n<!doctype html>\r\n<html lang=\"en\">\r\n    <head>\r\n        ");
{
    Object var_includedresult1 = renderContext.call("include", "partials/head.html", obj());
    out.write(renderContext.getObjectModel().toString(var_includedresult1));
}
out.write("\r\n        ");
{
    Object var_includedresult4 = renderContext.call("include", "partials/headlibs.html", obj());
    out.write(renderContext.getObjectModel().toString(var_includedresult4));
}
out.write("\r\n    </head>\r\n    <body");
{
    String var_attrcontent6 = ("page " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(_dynamic_currentpage, "template"), "name"), "attribute")));
    {
        Object var_shoulddisplayattr7 = ((renderContext.getObjectModel().toBoolean(var_attrcontent6) ? var_attrcontent6 : ("false".equals(var_attrcontent6))));
        if (renderContext.getObjectModel().toBoolean(var_shoulddisplayattr7)) {
            out.write(" class=\"");
            out.write(renderContext.getObjectModel().toString(var_attrcontent6));
            out.write("\"");
        }
    }
}
out.write(">\r\n        ");
{
    Object var_includedresult9 = renderContext.call("include", "partials/main.html", obj());
    out.write(renderContext.getObjectModel().toString(var_includedresult9));
}
out.write("\r\n        ");
{
    Object var_includedresult12 = renderContext.call("include", "partials/footlibs.html", obj());
    out.write(renderContext.getObjectModel().toString(var_includedresult12));
}
out.write("\r\n    </body>\r\n</html>\r\n");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

