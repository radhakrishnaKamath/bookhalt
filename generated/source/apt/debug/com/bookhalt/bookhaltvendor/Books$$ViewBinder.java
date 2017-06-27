// Generated code from Butter Knife. Do not modify!
package com.bookhalt.bookhaltvendor;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class Books$$ViewBinder<T extends com.bookhalt.bookhaltvendor.Books> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558557, "field 'recyclerView'");
    target.recyclerView = finder.castView(view, 2131558557, "field 'recyclerView'");
    view = finder.findRequiredView(source, 2131558556, "field 'spinner1'");
    target.spinner1 = finder.castView(view, 2131558556, "field 'spinner1'");
  }

  @Override public void unbind(T target) {
    target.recyclerView = null;
    target.spinner1 = null;
  }
}
