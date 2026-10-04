package b6;

import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: b6.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0722C extends C0720A {

    /* renamed from: j, reason: collision with root package name */
    public final kotlinx.serialization.json.c f10964j;

    /* renamed from: k, reason: collision with root package name */
    public final List f10965k;

    /* renamed from: l, reason: collision with root package name */
    public final int f10966l;

    /* renamed from: m, reason: collision with root package name */
    public int f10967m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0722C(a6.d dVar, kotlinx.serialization.json.c cVar) {
        super(dVar, cVar, (String) null, 12);
        kotlin.jvm.internal.l.f("json", dVar);
        kotlin.jvm.internal.l.f("value", cVar);
        this.f10964j = cVar;
        List listS0 = P3.q.S0(cVar.f12722k.keySet());
        this.f10965k = listS0;
        this.f10966l = listS0.size() * 2;
        this.f10967m = -1;
    }

    @Override // b6.C0720A, b6.AbstractC0726a
    public final kotlinx.serialization.json.b E(String str) {
        kotlin.jvm.internal.l.f("tag", str);
        return this.f10967m % 2 == 0 ? a6.l.b(str) : (kotlinx.serialization.json.b) P3.E.m0(str, this.f10964j);
    }

    @Override // b6.C0720A, b6.AbstractC0726a
    public final String Q(SerialDescriptor serialDescriptor, int i7) {
        kotlin.jvm.internal.l.f("descriptor", serialDescriptor);
        return (String) this.f10965k.get(i7 / 2);
    }

    @Override // b6.C0720A, b6.AbstractC0726a
    public final kotlinx.serialization.json.b S() {
        return this.f10964j;
    }

    @Override // b6.C0720A
    /* renamed from: X */
    public final kotlinx.serialization.json.c S() {
        return this.f10964j;
    }

    @Override // b6.C0720A, b6.AbstractC0726a, Y5.a
    public final void b(SerialDescriptor serialDescriptor) {
        kotlin.jvm.internal.l.f("descriptor", serialDescriptor);
    }

    @Override // b6.C0720A, Y5.a
    public final int m(SerialDescriptor serialDescriptor) {
        kotlin.jvm.internal.l.f("descriptor", serialDescriptor);
        int i7 = this.f10967m;
        if (i7 >= this.f10966l - 1) {
            return -1;
        }
        int i8 = i7 + 1;
        this.f10967m = i8;
        return i8;
    }
}
