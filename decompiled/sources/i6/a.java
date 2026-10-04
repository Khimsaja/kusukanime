package i6;

import io.ktor.http.ContentDisposition;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public abstract class a {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f12042b;

    /* renamed from: c, reason: collision with root package name */
    public c f12043c;

    /* renamed from: d, reason: collision with root package name */
    public long f12044d;

    public a(String str, boolean z7) {
        l.f(ContentDisposition.Parameters.Name, str);
        this.a = str;
        this.f12042b = z7;
        this.f12044d = -1L;
    }

    public abstract long a();

    public final String toString() {
        return this.a;
    }
}
