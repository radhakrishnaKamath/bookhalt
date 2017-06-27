// Generated code from Butter Knife. Do not modify!
package com.bookhalt.bookhaltvendor;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class BookAdapter$ContentViewHolder$$ViewBinder<T extends com.bookhalt.bookhaltvendor.BookAdapter.ContentViewHolder> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558551, "field 'bname'");
    target.bname = finder.castView(view, 2131558551, "field 'bname'");
  }

  @Override public void unbind(T target) {
    target.bname = null;
  }
}
