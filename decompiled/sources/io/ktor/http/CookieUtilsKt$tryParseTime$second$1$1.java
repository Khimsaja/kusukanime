package io.ktor.http;

import e4.k;
import kotlin.Metadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
/* loaded from: classes.dex */
public final class CookieUtilsKt$tryParseTime$second$1$1 implements k {
    public static final CookieUtilsKt$tryParseTime$second$1$1 INSTANCE = new CookieUtilsKt$tryParseTime$second$1$1();

    public final Boolean invoke(char c2) {
        return Boolean.valueOf(CookieUtilsKt.isDigit(c2));
    }

    @Override // e4.k
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Character) obj).charValue());
    }
}
