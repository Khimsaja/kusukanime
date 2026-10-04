package d3;

import android.graphics.drawable.Drawable;

/* renamed from: d3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0793e extends AbstractC0798j {
    public final Drawable a;

    /* renamed from: b, reason: collision with root package name */
    public final C0797i f11258b;

    /* renamed from: c, reason: collision with root package name */
    public final Throwable f11259c;

    public C0793e(Drawable drawable, C0797i c0797i, Throwable th) {
        this.a = drawable;
        this.f11258b = c0797i;
        this.f11259c = th;
    }

    @Override // d3.AbstractC0798j
    public final Drawable a() {
        return this.a;
    }

    @Override // d3.AbstractC0798j
    public final C0797i b() {
        return this.f11258b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0793e)) {
            return false;
        }
        C0793e c0793e = (C0793e) obj;
        if (kotlin.jvm.internal.l.a(this.a, c0793e.a)) {
            return kotlin.jvm.internal.l.a(this.f11258b, c0793e.f11258b) && kotlin.jvm.internal.l.a(this.f11259c, c0793e.f11259c);
        }
        return false;
    }

    public final int hashCode() {
        Drawable drawable = this.a;
        return this.f11259c.hashCode() + ((this.f11258b.hashCode() + ((drawable != null ? drawable.hashCode() : 0) * 31)) * 31);
    }
}
