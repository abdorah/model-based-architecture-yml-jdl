/**
 * generated by Xtext 2.25.0
 */
package org.xtext.ensias.yjdsl.formatting2;

import com.google.inject.Inject;
import java.util.Arrays;
import jdl.Application;
import jdl.Config;
import jdl.Entity;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;
import org.xtext.ensias.yjdsl.services.YJDslGrammarAccess;

@SuppressWarnings("all")
public class YJDslFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private YJDslGrammarAccess _yJDslGrammarAccess;
  
  protected void _format(final Application application, @Extension final IFormattableDocument document) {
    document.<Config>format(application.getConfig());
    EList<Entity> _entity = application.getEntity();
    for (final Entity entity : _entity) {
      document.<Entity>format(entity);
    }
  }
  
  public void format(final Object application, final IFormattableDocument document) {
    if (application instanceof XtextResource) {
      _format((XtextResource)application, document);
      return;
    } else if (application instanceof Application) {
      _format((Application)application, document);
      return;
    } else if (application instanceof EObject) {
      _format((EObject)application, document);
      return;
    } else if (application == null) {
      _format((Void)null, document);
      return;
    } else if (application != null) {
      _format(application, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(application, document).toString());
    }
  }
}
