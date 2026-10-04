package G3;

import java.lang.reflect.Type;

/* loaded from: classes.dex */
public final class v extends j {
    public final Type a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2856b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2857c;

    /* renamed from: d, reason: collision with root package name */
    public j f2858d;

    public v(Type type, String str, Object obj) {
        this.a = type;
        this.f2856b = str;
        this.f2857c = obj;
    }

    @Override // G3.j
    public final Object a(m mVar) {
        j jVar = this.f2858d;
        if (jVar != null) {
            return jVar.a(mVar);
        }
        throw new IllegalStateException("JsonAdapter isn't ready");
    }

    @Override // G3.j
    public final void c(p pVar, Object obj) {
        j jVar = this.f2858d;
        if (jVar == null) {
            throw new IllegalStateException("JsonAdapter isn't ready");
        }
        jVar.c(pVar, obj);
    }

    public final String toString() {
        j jVar = this.f2858d;
        return jVar != null ? jVar.toString() : super.toString();
    }
}
