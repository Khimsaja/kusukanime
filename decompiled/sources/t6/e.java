package t6;

import b1.AbstractC0703b;
import java.io.IOException;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class e extends i6.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f16156e = 1;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g f16157f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(String str, g gVar) {
        super(str, true);
        this.f16157f = gVar;
    }

    @Override // i6.a
    public final long a() {
        switch (this.f16156e) {
            case 0:
                g gVar = this.f16157f;
                try {
                    if (gVar.h()) {
                    }
                } catch (IOException e7) {
                    gVar.c(e7, null);
                    break;
                }
                break;
            default:
                j6.i iVar = this.f16157f.f16166g;
                l.c(iVar);
                iVar.cancel();
                break;
        }
        return -1L;
        return -1L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar) {
        super(AbstractC0703b.m(new StringBuilder(), gVar.f16171l, " writer"), true);
        this.f16157f = gVar;
    }
}
