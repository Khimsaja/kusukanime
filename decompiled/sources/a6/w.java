package a6;

import Z5.G;
import Z5.t0;
import io.ktor.http.ContentDisposition;
import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes.dex */
public final class w implements SerialDescriptor {

    /* renamed from: b, reason: collision with root package name */
    public static final w f10490b = new w();

    /* renamed from: c, reason: collision with root package name */
    public static final String f10491c = "kotlinx.serialization.json.JsonObject";
    public final /* synthetic */ G a = n6.m.d(t0.a, m.a).f10295d;

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final n6.d c() {
        this.a.getClass();
        return X5.j.f9953j;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int d(String str) {
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, str);
        return this.a.d(str);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String e() {
        return f10491c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int f() {
        this.a.getClass();
        return 2;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String g(int i7) {
        this.a.getClass();
        return String.valueOf(i7);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        this.a.getClass();
        return P3.y.f7779k;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean h() {
        this.a.getClass();
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List i(int i7) {
        this.a.i(i7);
        return P3.y.f7779k;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        this.a.getClass();
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor j(int i7) {
        return this.a.j(i7);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean k(int i7) {
        this.a.k(i7);
        return false;
    }
}
