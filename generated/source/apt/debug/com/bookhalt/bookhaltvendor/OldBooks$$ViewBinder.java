// Generated code from Butter Knife. Do not modify!
package com.bookhalt.bookhaltvendor;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class OldBooks$$ViewBinder<T extends com.bookhalt.bookhaltvendor.OldBooks> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558649, "field 'recyclerView'");
    target.recyclerView = finder.castView(view, 2131558649, "field 'recyclerView'");
  }

  @Override public void unbind(T target) {
    target.recyclerView = null;
  }
}
