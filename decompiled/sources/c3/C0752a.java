package c3;

import e4.InterfaceC0821a;
import f.AbstractC0841b;
import f6.AbstractC0905c;
import f6.C0906d;
import f6.C0925w;
import java.util.regex.Pattern;
import kotlin.jvm.internal.m;

/* renamed from: c3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0752a extends m implements InterfaceC0821a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f11144l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0753b f11145m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0752a(C0753b c0753b, int i7) {
        super(0);
        this.f11144l = i7;
        this.f11145m = c0753b;
    }

    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        C0753b c0753b = this.f11145m;
        switch (this.f11144l) {
            case 0:
                C0906d c0906d = C0906d.f11534n;
                return AbstractC0905c.w(c0753b.f11150f);
            default:
                String strA = c0753b.f11150f.a("Content-Type");
                if (strA == null) {
                    return null;
                }
                Pattern pattern = C0925w.f11614e;
                return AbstractC0841b.m(strA);
        }
    }
}
