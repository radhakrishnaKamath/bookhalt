// Generated code from Butter Knife. Do not modify!
package com.bookhalt.bookhaltvendor;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class Login$$ViewBinder<T extends com.bookhalt.bookhaltvendor.Login> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558631, "field 'signUp'");
    target.signUp = finder.castView(view, 2131558631, "field 'signUp'");
    view = finder.findRequiredView(source, 2131558630, "field 'forgot1'");
    target.forgot1 = finder.castView(view, 2131558630, "field 'forgot1'");
  }

  @Override public void unbind(T target) {
    target.signUp = null;
    target.forgot1 = null;
  }
}
