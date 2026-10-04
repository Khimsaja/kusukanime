package b6;

import java.util.LinkedHashMap;

/* renamed from: b6.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0723D extends y {

    /* renamed from: i, reason: collision with root package name */
    public String f10968i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f10969j;

    @Override // b6.y
    public final kotlinx.serialization.json.b K() {
        return new kotlinx.serialization.json.c((LinkedHashMap) this.f11047h);
    }

    @Override // b6.y
    public final void N(String str, kotlinx.serialization.json.b bVar) {
        kotlin.jvm.internal.l.f("key", str);
        kotlin.jvm.internal.l.f("element", bVar);
        if (!this.f10969j) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.f11047h;
            String str2 = this.f10968i;
            if (str2 == null) {
                kotlin.jvm.internal.l.l("tag");
                throw null;
            }
            linkedHashMap.put(str2, bVar);
            this.f10969j = true;
            return;
        }
        if (bVar instanceof kotlinx.serialization.json.d) {
            this.f10968i = ((kotlinx.serialization.json.d) bVar).a();
            this.f10969j = false;
        } else {
            if (bVar instanceof kotlinx.serialization.json.c) {
                throw v.b(a6.x.f10492b);
            }
            if (!(bVar instanceof kotlinx.serialization.json.a)) {
                throw new D6.r();
            }
            throw v.b(a6.g.f10464b);
        }
    }
}
