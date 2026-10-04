package G2;

import b1.AbstractC0703b;
import io.ktor.http.ContentDisposition;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class P {

    /* renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap f2682b = new LinkedHashMap();
    public final LinkedHashMap a = new LinkedHashMap();

    public final void a(O o7) {
        kotlin.jvm.internal.l.f("navigator", o7);
        String strD = AbstractC0170g.d(o7.getClass());
        if (strD.length() <= 0) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        LinkedHashMap linkedHashMap = this.a;
        O o8 = (O) linkedHashMap.get(strD);
        if (kotlin.jvm.internal.l.a(o8, o7)) {
            return;
        }
        boolean z7 = false;
        if (o8 != null && o8.f2681b) {
            z7 = true;
        }
        if (z7) {
            throw new IllegalStateException(("Navigator " + o7 + " is replacing an already attached " + o8).toString());
        }
        if (!o7.f2681b) {
            return;
        }
        throw new IllegalStateException(("Navigator " + o7 + " is already attached to another NavController").toString());
    }

    public final O b(String str) {
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, str);
        if (str.length() <= 0) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        O o7 = (O) this.a.get(str);
        if (o7 != null) {
            return o7;
        }
        throw new IllegalStateException(AbstractC0703b.j("Could not find Navigator with name \"", str, "\". You must call NavController.addNavigator() for each navigation type."));
    }
}
