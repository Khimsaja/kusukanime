package b6;

import io.ktor.http.ContentType;

/* loaded from: classes.dex */
public final class q extends V5.m {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(String str, int i7) {
        super(str);
        switch (i7) {
            case 1:
                kotlin.jvm.internal.l.f(ContentType.Message.TYPE, str);
                super(str);
                break;
            default:
                kotlin.jvm.internal.l.f(ContentType.Message.TYPE, str);
                break;
        }
    }
}
