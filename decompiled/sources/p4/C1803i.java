package p4;

import D4.S;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: p4.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1803i extends x {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f14385e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1803i(Member member, Type type, Class cls, Type[] typeArr, int i7) {
        super(member, type, cls, typeArr);
        this.f14385e = i7;
    }

    @Override // p4.InterfaceC1801g
    public final Object call(Object[] objArr) {
        switch (this.f14385e) {
            case 0:
                kotlin.jvm.internal.l.f("args", objArr);
                d(objArr);
                Constructor constructor = (Constructor) this.a;
                S s7 = new S(2);
                s7.j(objArr);
                s7.g(null);
                ArrayList arrayList = s7.f1530k;
                return constructor.newInstance(arrayList.toArray(new Object[arrayList.size()]));
            default:
                kotlin.jvm.internal.l.f("args", objArr);
                d(objArr);
                return ((Constructor) this.a).newInstance(Arrays.copyOf(objArr, objArr.length));
        }
    }
}
