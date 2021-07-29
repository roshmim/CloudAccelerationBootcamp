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

public final class head_html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_head = null;
Object _dynamic_currentpage = bindings.get("currentpage");
Object _dynamic_properties = bindings.get("properties");
out.write("\r\n");
_global_head = renderContext.call("use", "head.js", obj());
out.write("<meta charset=\"utf-8\"/>\r\n<title>");
{
    Object var_0 = renderContext.call("xss", ((renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(_dynamic_currentpage, "title")) ? renderContext.getObjectModel().resolveProperty(_dynamic_currentpage, "title") : renderContext.getObjectModel().resolveProperty(_dynamic_currentpage, "name"))), "text");
    out.write(renderContext.getObjectModel().toString(var_0));
}
out.write("</title>\r\n<meta name=\"keywords\"");
{
    Object var_attrvalue1 = renderContext.getObjectModel().resolveProperty(_global_head, "keywords");
    {
        Object var_attrcontent2 = renderContext.call("xss", var_attrvalue1, "attribute");
        {
            Object var_shoulddisplayattr4 = ((renderContext.getObjectModel().toBoolean(var_attrcontent2) ? var_attrcontent2 : ("false".equals(var_attrvalue1))));
            if (renderContext.getObjectModel().toBoolean(var_shoulddisplayattr4)) {
                out.write(" content");
                {
                    boolean var_istrueattr3 = (var_attrvalue1.equals(true));
                    if (!var_istrueattr3) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent2));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
out.write("/>\r\n<meta name=\"description\"");
{
    Object var_attrvalue5 = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "jcr:description");
    {
        Object var_attrcontent6 = renderContext.call("xss", var_attrvalue5, "attribute");
        {
            Object var_shoulddisplayattr8 = ((renderContext.getObjectModel().toBoolean(var_attrcontent6) ? var_attrcontent6 : ("false".equals(var_attrvalue5))));
            if (renderContext.getObjectModel().toBoolean(var_shoulddisplayattr8)) {
                out.write(" content");
                {
                    boolean var_istrueattr7 = (var_attrvalue5.equals(true));
                    if (!var_istrueattr7) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent6));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
out.write("/>\r\n");
{
    Object var_testvariable9 = renderContext.getObjectModel().resolveProperty(_global_head, "favIcon");
    if (renderContext.getObjectModel().toBoolean(var_testvariable9)) {
        out.write("<link rel=\"icon\"");
        {
            Object var_attrvalue10 = renderContext.getObjectModel().resolveProperty(_global_head, "favIcon");
            {
                Object var_attrcontent11 = renderContext.call("xss", var_attrvalue10, "uri");
                {
                    Object var_shoulddisplayattr13 = ((renderContext.getObjectModel().toBoolean(var_attrcontent11) ? var_attrcontent11 : ("false".equals(var_attrvalue10))));
                    if (renderContext.getObjectModel().toBoolean(var_shoulddisplayattr13)) {
                        out.write(" href");
                        {
                            boolean var_istrueattr12 = (var_attrvalue10.equals(true));
                            if (!var_istrueattr12) {
                                out.write("=\"");
                                out.write(renderContext.getObjectModel().toString(var_attrcontent11));
                                out.write("\"");
                            }
                        }
                    }
                }
            }
        }
        out.write("/>");
    }
}


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

