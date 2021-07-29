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
package org.apache.sling.scripting.sightly.apps.wknd.components.structure.topnav;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class topnav_html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_topnav = null;
Collection var_collectionvar0_list_coerced$ = null;
out.write("\r\n");
_global_topnav = renderContext.call("use", "topnav.js", obj());
{
    Object var_collectionvar0 = renderContext.getObjectModel().resolveProperty(_global_topnav, "items");
    {
        long var_size1 = ((var_collectionvar0_list_coerced$ == null ? (var_collectionvar0_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar0)) : var_collectionvar0_list_coerced$).size());
        {
            boolean var_notempty2 = (var_size1 > 0);
            if (var_notempty2) {
                {
                    long var_end5 = var_size1;
                    {
                        boolean var_validstartstepend6 = (((0 < var_size1) && true) && (var_end5 > 0));
                        if (var_validstartstepend6) {
                            out.write("<ul class=\"topnav\">");
                            if (var_collectionvar0_list_coerced$ == null) {
                                var_collectionvar0_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar0);
                            }
                            long var_index7 = 0;
                            for (Object item : var_collectionvar0_list_coerced$) {
                                {
                                    boolean var_traversal9 = (((var_index7 >= 0) && (var_index7 <= var_end5)) && true);
                                    if (var_traversal9) {
                                        out.write("\r\n    <li");
                                        {
                                            String var_attrcontent10 = ("topnav__item " + renderContext.getObjectModel().toString(renderContext.call("xss", ((renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(item, "selected")) ? "topnav__item--selected" : renderContext.getObjectModel().resolveProperty(item, "selected"))), "attribute")));
                                            {
                                                Object var_shoulddisplayattr11 = ((renderContext.getObjectModel().toBoolean(var_attrcontent10) ? var_attrcontent10 : ("false".equals(var_attrcontent10))));
                                                if (renderContext.getObjectModel().toBoolean(var_shoulddisplayattr11)) {
                                                    out.write(" class=\"");
                                                    out.write(renderContext.getObjectModel().toString(var_attrcontent10));
                                                    out.write("\"");
                                                }
                                            }
                                        }
                                        out.write(">\r\n        <a class=\"topnav__link\"");
                                        {
                                            String var_attrcontent12 = (renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(item, "page"), "path"), "uri")) + ".html");
                                            {
                                                Object var_shoulddisplayattr13 = ((renderContext.getObjectModel().toBoolean(var_attrcontent12) ? var_attrcontent12 : ("false".equals(var_attrcontent12))));
                                                if (renderContext.getObjectModel().toBoolean(var_shoulddisplayattr13)) {
                                                    out.write(" href=\"");
                                                    out.write(renderContext.getObjectModel().toString(var_attrcontent12));
                                                    out.write("\"");
                                                }
                                            }
                                        }
                                        out.write(">");
                                        {
                                            Object var_14 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(renderContext.getObjectModel().resolveProperty(item, "page"), "title"), "text");
                                            out.write(renderContext.getObjectModel().toString(var_14));
                                        }
                                        out.write("</a> \r\n    </li>\r\n");
                                    }
                                }
                                var_index7++;
                            }
                            out.write("</ul>");
                        }
                    }
                }
            }
        }
    }
    var_collectionvar0_list_coerced$ = null;
}


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

