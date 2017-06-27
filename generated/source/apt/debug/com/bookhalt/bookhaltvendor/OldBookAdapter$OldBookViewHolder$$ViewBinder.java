// Generated code from Butter Knife. Do not modify!
package com.bookhalt.bookhaltvendor;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class OldBookAdapter$OldBookViewHolder$$ViewBinder<T extends com.bookhalt.bookhaltvendor.OldBookAdapter.OldBookViewHolder> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558651, "field 'oldimg'");
    target.oldimg = finder.castView(view, 2131558651, "field 'oldimg'");
    view = finder.findRequiredView(source, 2131558652, "field 'oldname'");
    target.oldname = finder.castView(view, 2131558652, "field 'oldname'");
    view = finder.findRequiredView(source, 2131558653, "field 'oldprice'");
    target.oldprice = finder.castView(view, 2131558653, "field 'oldprice'");
  }

  @Override public void unbind(T target) {
    target.oldimg = null;
    target.oldname = null;
    target.oldprice = null;
  }
}
