package f6;

/* renamed from: f6.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC0888B {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");


    /* renamed from: k, reason: collision with root package name */
    public final String f11470k;

    EnumC0888B(String str) {
        this.f11470k = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f11470k;
    }
}
