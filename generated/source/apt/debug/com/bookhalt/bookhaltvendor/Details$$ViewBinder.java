// Generated code from Butter Knife. Do not modify!
package com.bookhalt.bookhaltvendor;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class Details$$ViewBinder<T extends com.bookhalt.bookhaltvendor.Details> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558589, "field 'recyclerView1'");
    target.recyclerView1 = finder.castView(view, 2131558589, "field 'recyclerView1'");
  }

  @Override public void unbind(T target) {
    target.recyclerView1 = null;
  }
}
