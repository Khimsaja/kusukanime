package b6;

import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: b6.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0721B extends AbstractC0726a {

    /* renamed from: f, reason: collision with root package name */
    public final kotlinx.serialization.json.a f10961f;

    /* renamed from: g, reason: collision with root package name */
    public final int f10962g;

    /* renamed from: h, reason: collision with root package name */
    public int f10963h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0721B(a6.d dVar, kotlinx.serialization.json.a aVar) {
        super(dVar, null);
        kotlin.jvm.internal.l.f("json", dVar);
        kotlin.jvm.internal.l.f("value", aVar);
        this.f10961f = aVar;
        this.f10962g = aVar.f12721k.size();
        this.f10963h = -1;
    }

    @Override // b6.AbstractC0726a
    public final kotlinx.serialization.json.b E(String str) throws NumberFormatException {
        kotlin.jvm.internal.l.f("tag", str);
        return (kotlinx.serialization.json.b) this.f10961f.f12721k.get(Integer.parseInt(str));
    }

    @Override // b6.AbstractC0726a
    public final String Q(SerialDescriptor serialDescriptor, int i7) {
        kotlin.jvm.internal.l.f("descriptor", serialDescriptor);
        return String.valueOf(i7);
    }

    @Override // b6.AbstractC0726a
    public final kotlinx.serialization.json.b S() {
        return this.f10961f;
    }

    @Override // Y5.a
    public final int m(SerialDescriptor serialDescriptor) {
        kotlin.jvm.internal.l.f("descriptor", serialDescriptor);
        int i7 = this.f10963h;
        if (i7 >= this.f10962g - 1) {
            return -1;
        }
        int i8 = i7 + 1;
        this.f10963h = i8;
        return i8;
    }
}
