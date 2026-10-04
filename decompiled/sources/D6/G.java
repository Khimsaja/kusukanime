package D6;

import java.util.Objects;

/* loaded from: classes.dex */
public final class G extends c0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1658d;

    /* renamed from: e, reason: collision with root package name */
    public final String f1659e;

    /* renamed from: f, reason: collision with root package name */
    public final C0108b f1660f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f1661g;

    public G(String str, int i7, boolean z7) {
        this.f1658d = i7;
        switch (i7) {
            case 1:
                C0108b c0108b = C0108b.f1739l;
                Objects.requireNonNull(str, "name == null");
                this.f1659e = str;
                this.f1660f = c0108b;
                this.f1661g = z7;
                break;
            case 2:
                C0108b c0108b2 = C0108b.f1739l;
                Objects.requireNonNull(str, "name == null");
                this.f1659e = str;
                this.f1660f = c0108b2;
                this.f1661g = z7;
                break;
            default:
                C0108b c0108b3 = C0108b.f1739l;
                Objects.requireNonNull(str, "name == null");
                this.f1659e = str;
                this.f1660f = c0108b3;
                this.f1661g = z7;
                break;
        }
    }

    @Override // D6.c0
    public final void a(S s7, Object obj) {
        switch (this.f1658d) {
            case 0:
                if (obj != null) {
                    this.f1660f.getClass();
                    String string = obj.toString();
                    if (string != null) {
                        s7.a(this.f1659e, string, this.f1661g);
                        break;
                    }
                }
                break;
            case 1:
                if (obj != null) {
                    this.f1660f.getClass();
                    String string2 = obj.toString();
                    if (string2 != null) {
                        s7.b(this.f1659e, string2, this.f1661g);
                        break;
                    }
                }
                break;
            default:
                if (obj != null) {
                    this.f1660f.getClass();
                    String string3 = obj.toString();
                    if (string3 != null) {
                        s7.d(this.f1659e, string3, this.f1661g);
                        break;
                    }
                }
                break;
        }
    }
}
