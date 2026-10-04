package f3;

import T2.p;
import android.graphics.drawable.Drawable;
import d3.AbstractC0798j;
import d3.C0793e;
import d3.C0803o;

/* renamed from: f3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0878d implements InterfaceC0880f {
    public final p a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0798j f11435b;

    public C0878d(p pVar, AbstractC0798j abstractC0798j) {
        this.a = pVar;
        this.f11435b = abstractC0798j;
    }

    @Override // f3.InterfaceC0880f
    public final void a() {
        AbstractC0798j abstractC0798j = this.f11435b;
        boolean z7 = abstractC0798j instanceof C0803o;
        p pVar = this.a;
        if (z7) {
            Drawable drawable = ((C0803o) abstractC0798j).a;
            pVar.getClass();
        } else if (abstractC0798j instanceof C0793e) {
            abstractC0798j.getClass();
            pVar.getClass();
        }
    }
}
