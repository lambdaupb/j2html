package j2html.tags.attributes;

import j2html.tags.Tag;

public interface IPlaceholder<T extends Tag> extends IInstance<T> {
    default T withPlaceholder(final String placeholder_) {
        get().attr("placeholder", placeholder_);
        return get();
    }

    default T withCondPlaceholder(final boolean enable, final String placeholder_) {
        if (enable) {
            get().attr("placeholder", placeholder_);
        }
        return get();
    }
}
