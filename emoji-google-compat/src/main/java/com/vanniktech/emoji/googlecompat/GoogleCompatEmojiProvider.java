package com.vanniktech.emoji.googlecompat;

import android.support.annotation.NonNull;
import android.support.text.emoji.EmojiCompat;
import com.vanniktech.emoji.EmojiProvider;
import com.vanniktech.emoji.emoji.EmojiCategory;
import com.vanniktech.emoji.googlecompat.category.ActivityCategory;
import com.vanniktech.emoji.googlecompat.category.FlagsCategory;
import com.vanniktech.emoji.googlecompat.category.FoodCategory;
import com.vanniktech.emoji.googlecompat.category.NatureCategory;
import com.vanniktech.emoji.googlecompat.category.ObjectsCategory;
import com.vanniktech.emoji.googlecompat.category.PeopleCategory;
import com.vanniktech.emoji.googlecompat.category.SymbolsCategory;
import com.vanniktech.emoji.googlecompat.category.TravelCategory;

public final class GoogleCompatEmojiProvider implements EmojiProvider {
  public GoogleCompatEmojiProvider(@NonNull final EmojiCompat emojiCompat) {
    if (emojiCompat == null) {
      throw new NullPointerException();
    }
  }

  @Override @NonNull public EmojiCategory[] getCategories() {
    return new EmojiCategory[] {
      new PeopleCategory(),
      new NatureCategory(),
      new FoodCategory(),
      new ActivityCategory(),
      new TravelCategory(),
      new ObjectsCategory(),
      new SymbolsCategory(),
      new FlagsCategory()
    };
  }
}
