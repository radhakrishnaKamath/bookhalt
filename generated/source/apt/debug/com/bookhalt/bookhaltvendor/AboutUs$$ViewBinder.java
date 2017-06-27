// Generated code from Butter Knife. Do not modify!
package com.bookhalt.bookhaltvendor;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class AboutUs$$ViewBinder<T extends com.bookhalt.bookhaltvendor.AboutUs> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558523, "field 'bottomSheet'");
    target.bottomSheet = view;
  }

  @Override public void unbind(T target) {
    target.bottomSheet = null;
  }
}
