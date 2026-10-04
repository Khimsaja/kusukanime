package Z5;

import e4.InterfaceC0821a;
import io.ktor.http.ContentDisposition;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: Z5.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0636g0 implements SerialDescriptor, InterfaceC0643l {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final F f10327b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10328c;

    /* renamed from: d, reason: collision with root package name */
    public int f10329d = -1;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f10330e;

    /* renamed from: f, reason: collision with root package name */
    public final List[] f10331f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f10332g;

    /* renamed from: h, reason: collision with root package name */
    public Object f10333h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f10334i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f10335j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f10336k;

    public C0636g0(String str, F f5, int i7) {
        this.a = str;
        this.f10327b = f5;
        this.f10328c = i7;
        String[] strArr = new String[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            strArr[i8] = "[UNINITIALIZED]";
        }
        this.f10330e = strArr;
        int i9 = this.f10328c;
        this.f10331f = new List[i9];
        this.f10332g = new boolean[i9];
        this.f10333h = P3.z.f7780k;
        O3.j jVar = O3.j.f7525k;
        final int i10 = 0;
        this.f10334i = z1.c.B(jVar, new InterfaceC0821a(this) { // from class: Z5.f0

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ C0636g0 f10325l;

            {
                this.f10325l = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [O3.i, java.lang.Object] */
            @Override // e4.InterfaceC0821a
            public final Object invoke() {
                KSerializer[] kSerializerArrChildSerializers;
                ArrayList arrayList;
                KSerializer[] kSerializerArrTypeParametersSerializers;
                switch (i10) {
                    case 0:
                        F f7 = this.f10325l.f10327b;
                        return (f7 == null || (kSerializerArrChildSerializers = f7.childSerializers()) == null) ? AbstractC0632e0.f10321b : kSerializerArrChildSerializers;
                    case 1:
                        F f8 = this.f10325l.f10327b;
                        if (f8 == null || (kSerializerArrTypeParametersSerializers = f8.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(kSerializerArrTypeParametersSerializers.length);
                            for (KSerializer kSerializer : kSerializerArrTypeParametersSerializers) {
                                arrayList.add(kSerializer.getDescriptor());
                            }
                        }
                        return AbstractC0632e0.c(arrayList);
                    default:
                        C0636g0 c0636g0 = this.f10325l;
                        return Integer.valueOf(AbstractC0632e0.e(c0636g0, (SerialDescriptor[]) c0636g0.f10335j.getValue()));
                }
            }
        });
        final int i11 = 1;
        this.f10335j = z1.c.B(jVar, new InterfaceC0821a(this) { // from class: Z5.f0

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ C0636g0 f10325l;

            {
                this.f10325l = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [O3.i, java.lang.Object] */
            @Override // e4.InterfaceC0821a
            public final Object invoke() {
                KSerializer[] kSerializerArrChildSerializers;
                ArrayList arrayList;
                KSerializer[] kSerializerArrTypeParametersSerializers;
                switch (i11) {
                    case 0:
                        F f7 = this.f10325l.f10327b;
                        return (f7 == null || (kSerializerArrChildSerializers = f7.childSerializers()) == null) ? AbstractC0632e0.f10321b : kSerializerArrChildSerializers;
                    case 1:
                        F f8 = this.f10325l.f10327b;
                        if (f8 == null || (kSerializerArrTypeParametersSerializers = f8.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(kSerializerArrTypeParametersSerializers.length);
                            for (KSerializer kSerializer : kSerializerArrTypeParametersSerializers) {
                                arrayList.add(kSerializer.getDescriptor());
                            }
                        }
                        return AbstractC0632e0.c(arrayList);
                    default:
                        C0636g0 c0636g0 = this.f10325l;
                        return Integer.valueOf(AbstractC0632e0.e(c0636g0, (SerialDescriptor[]) c0636g0.f10335j.getValue()));
                }
            }
        });
        final int i12 = 2;
        this.f10336k = z1.c.B(jVar, new InterfaceC0821a(this) { // from class: Z5.f0

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ C0636g0 f10325l;

            {
                this.f10325l = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [O3.i, java.lang.Object] */
            @Override // e4.InterfaceC0821a
            public final Object invoke() {
                KSerializer[] kSerializerArrChildSerializers;
                ArrayList arrayList;
                KSerializer[] kSerializerArrTypeParametersSerializers;
                switch (i12) {
                    case 0:
                        F f7 = this.f10325l.f10327b;
                        return (f7 == null || (kSerializerArrChildSerializers = f7.childSerializers()) == null) ? AbstractC0632e0.f10321b : kSerializerArrChildSerializers;
                    case 1:
                        F f8 = this.f10325l.f10327b;
                        if (f8 == null || (kSerializerArrTypeParametersSerializers = f8.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(kSerializerArrTypeParametersSerializers.length);
                            for (KSerializer kSerializer : kSerializerArrTypeParametersSerializers) {
                                arrayList.add(kSerializer.getDescriptor());
                            }
                        }
                        return AbstractC0632e0.c(arrayList);
                    default:
                        C0636g0 c0636g0 = this.f10325l;
                        return Integer.valueOf(AbstractC0632e0.e(c0636g0, (SerialDescriptor[]) c0636g0.f10335j.getValue()));
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // Z5.InterfaceC0643l
    public final Set a() {
        return this.f10333h.keySet();
    }

    public final void b(String str, boolean z7) {
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, str);
        int i7 = this.f10329d + 1;
        this.f10329d = i7;
        String[] strArr = this.f10330e;
        strArr[i7] = str;
        this.f10332g[i7] = z7;
        this.f10331f[i7] = null;
        if (i7 == this.f10328c - 1) {
            HashMap map = new HashMap();
            int length = strArr.length;
            for (int i8 = 0; i8 < length; i8++) {
                map.put(strArr[i8], Integer.valueOf(i8));
            }
            this.f10333h = map;
        }
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public n6.d c() {
        return X5.j.f9951h;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int d(String str) {
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, str);
        Integer num = (Integer) this.f10333h.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String e() {
        return this.a;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [O3.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [O3.i, java.lang.Object] */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0636g0) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (this.a.equals(serialDescriptor.e()) && Arrays.equals((SerialDescriptor[]) this.f10335j.getValue(), (SerialDescriptor[]) ((C0636g0) obj).f10335j.getValue())) {
                int iF = serialDescriptor.f();
                int i7 = this.f10328c;
                if (i7 == iF) {
                    for (int i8 = 0; i8 < i7; i8++) {
                        if (kotlin.jvm.internal.l.a(j(i8).e(), serialDescriptor.j(i8).e()) && kotlin.jvm.internal.l.a(j(i8).c(), serialDescriptor.j(i8).c())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int f() {
        return this.f10328c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String g(int i7) {
        return this.f10330e[i7];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        return P3.y.f7779k;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean h() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [O3.i, java.lang.Object] */
    public int hashCode() {
        return ((Number) this.f10336k.getValue()).intValue();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List i(int i7) {
        List list = this.f10331f[i7];
        return list == null ? P3.y.f7779k : list;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isInline() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [O3.i, java.lang.Object] */
    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public SerialDescriptor j(int i7) {
        return ((KSerializer[]) this.f10334i.getValue())[i7].getDescriptor();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean k(int i7) {
        return this.f10332g[i7];
    }

    public String toString() {
        return AbstractC0632e0.l(this);
    }
}
