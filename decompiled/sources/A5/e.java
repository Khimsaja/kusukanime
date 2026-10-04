package A5;

import io.ktor.http.ContentType;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class e extends IllegalArgumentException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(String str, int i7) {
        super(str);
        switch (i7) {
            case 1:
                l.f(ContentType.Message.TYPE, str);
                super(str, null);
                break;
            default:
                l.f(ContentType.Message.TYPE, str);
                break;
        }
    }
}
