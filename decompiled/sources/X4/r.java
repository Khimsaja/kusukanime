package X4;

import java.io.IOException;

/* loaded from: classes.dex */
public final class r extends IOException {

    /* renamed from: k, reason: collision with root package name */
    public AbstractC0605b f9907k;

    public r(String str) {
        super(str);
        this.f9907k = null;
    }

    public static r b() {
        return new r("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    public final void a(AbstractC0615l abstractC0615l) {
        this.f9907k = abstractC0615l;
    }
}
