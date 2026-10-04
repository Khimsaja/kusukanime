package k5;

import X4.C0611h;
import X4.C0617n;
import i5.AbstractC1081a;
import kotlin.jvm.internal.l;
import z5.AbstractC2517v;

/* renamed from: k5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1397a extends AbstractC1081a {

    /* renamed from: m, reason: collision with root package name */
    public static final C1397a f12688m;

    static {
        C0611h c0611h = new C0611h();
        S4.b.a(c0611h);
        C0617n c0617n = S4.b.a;
        l.e("packageFqName", c0617n);
        C0617n c0617n2 = S4.b.f8772c;
        l.e("constructorAnnotation", c0617n2);
        C0617n c0617n3 = S4.b.f8771b;
        l.e("classAnnotation", c0617n3);
        C0617n c0617n4 = S4.b.f8773d;
        l.e("functionAnnotation", c0617n4);
        C0617n c0617n5 = S4.b.f8774e;
        l.e("propertyAnnotation", c0617n5);
        C0617n c0617n6 = S4.b.f8775f;
        l.e("propertyGetterAnnotation", c0617n6);
        C0617n c0617n7 = S4.b.f8776g;
        l.e("propertySetterAnnotation", c0617n7);
        C0617n c0617n8 = S4.b.f8778i;
        l.e("enumEntryAnnotation", c0617n8);
        C0617n c0617n9 = S4.b.f8777h;
        l.e("compileTimeValue", c0617n9);
        C0617n c0617n10 = S4.b.f8779j;
        l.e("parameterAnnotation", c0617n10);
        C0617n c0617n11 = S4.b.f8780k;
        l.e("typeAnnotation", c0617n11);
        C0617n c0617n12 = S4.b.f8781l;
        l.e("typeParameterAnnotation", c0617n12);
        f12688m = new C1397a(c0611h, c0617n, c0617n2, c0617n3, c0617n4, c0617n5, c0617n6, c0617n7, c0617n8, c0617n9, c0617n10, c0617n11, c0617n12);
    }

    public static String a(W4.c cVar) {
        String strB;
        l.f("fqName", cVar);
        StringBuilder sb = new StringBuilder();
        W4.d dVar = cVar.a;
        sb.append(AbstractC2517v.Q(dVar.a, '.', '/'));
        sb.append('/');
        if (dVar.c()) {
            strB = "default-package";
        } else {
            strB = dVar.g().b();
            l.e("asString(...)", strB);
        }
        sb.append(strB.concat(".kotlin_builtins"));
        return sb.toString();
    }
}
