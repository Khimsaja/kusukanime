package io.ktor.util.date;

import A6.b;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lio/ktor/util/date/InvalidDateStringException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "", "data", "", "at", "pattern", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class InvalidDateStringException extends IllegalStateException {
    public InvalidDateStringException(String str, int i7, String str2) {
        l.f("data", str);
        l.f("pattern", str2);
        StringBuilder sb = new StringBuilder("Failed to parse date string: \"");
        sb.append(str);
        sb.append("\" at index ");
        sb.append(i7);
        sb.append(". Pattern: \"");
        super(b.j(sb, str2, '\"'));
    }
}
