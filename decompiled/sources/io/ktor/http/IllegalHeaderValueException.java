package io.ktor.http;

import b1.AbstractC0703b;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lio/ktor/http/IllegalHeaderValueException;", "Ljava/lang/IllegalArgumentException;", "Lkotlin/IllegalArgumentException;", "", "headerValue", "", "position", "<init>", "(Ljava/lang/String;I)V", "Ljava/lang/String;", "getHeaderValue", "()Ljava/lang/String;", "I", "getPosition", "()I", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class IllegalHeaderValueException extends IllegalArgumentException {
    private final String headerValue;
    private final int position;

    public IllegalHeaderValueException(String str, int i7) {
        l.f("headerValue", str);
        StringBuilder sb = new StringBuilder("Header value '");
        sb.append(str);
        sb.append("' contains illegal character '");
        sb.append(str.charAt(i7));
        sb.append("' (code ");
        super(AbstractC0703b.l(sb, str.charAt(i7) & 255, ')'));
        this.headerValue = str;
        this.position = i7;
    }

    public final String getHeaderValue() {
        return this.headerValue;
    }

    public final int getPosition() {
        return this.position;
    }
}
