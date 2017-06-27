// Generated code from Butter Knife. Do not modify!
package com.bookhalt.bookhaltvendor;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class ContactUs$$ViewBinder<T extends com.bookhalt.bookhaltvendor.ContactUs> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558523, "field 'bottomSheet'");
    target.bottomSheet = view;
  }

  @Override public void unbind(T target) {
    target.bottomSheet = null;
  }
}
