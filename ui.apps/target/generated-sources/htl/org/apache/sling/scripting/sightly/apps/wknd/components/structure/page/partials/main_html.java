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
package org.apache.sling.scripting.sightly.apps.wknd.components.structure.page.partials;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class main_html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_main = null;
out.write("\r\n");
_global_main = renderContext.call("use", "main.js", obj());
out.write("<div class=\"page__main\">\r\n    <header class=\"page__header\">\r\n        <div class=\"page__logo\">");
{
    Object var_resourcecontent0 = renderContext.call("includeResource", "logo", obj());
    out.write(renderContext.getObjectModel().toString(var_resourcecontent0));
}
out.write("</div>\r\n        <nav class=\"page__topnav\">");
{
    Object var_resourcecontent1 = renderContext.call("includeResource", "topnav", obj());
    out.write(renderContext.getObjectModel().toString(var_resourcecontent1));
}
out.write("</nav>\r\n    </header>\r\n\r\n    <div class=\"page__title\">");
{
    Object var_resourcecontent2 = renderContext.call("includeResource", "title", obj().with("decorationTagName", "div"));
    out.write(renderContext.getObjectModel().toString(var_resourcecontent2));
}
out.write("</div>\r\n    <div class=\"page__par\">");
{
    Object var_resourcecontent3 = renderContext.call("includeResource", "par", obj());
    out.write(renderContext.getObjectModel().toString(var_resourcecontent3));
}
out.write("</div>\r\n\r\n    <footer class=\"page__footer\">\r\n        <p class=\"page__copyright\">");
{
    Object var_4 = renderContext.call("xss", renderContext.call("format", renderContext.call("i18n", "&copy; {0} WKND Legacy Site Site. All rights reserved.", obj().with("i18n", null)), obj().with("format", renderContext.getObjectModel().resolveProperty(_global_main, "year"))), "html");
    out.write(renderContext.getObjectModel().toString(var_4));
}
out.write("</p>\r\n    </footer>\r\n</div>");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

