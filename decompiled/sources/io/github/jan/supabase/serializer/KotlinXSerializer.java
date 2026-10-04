package io.github.jan.supabase.serializer;

import a6.d;
import io.github.jan.supabase.SupabaseSerializer;
import io.ktor.http.LinkHeader;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;
import l4.InterfaceC1444w;
import q0.c;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\u0006\u001a\u00020\u0007\"\b\b\u0000\u0010\b*\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u0002H\bH\u0016¢\u0006\u0002\u0010\rJ'\u0010\u000e\u001a\u0002H\b\"\b\b\u0000\u0010\b*\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0007H\u0016¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lio/github/jan/supabase/serializer/KotlinXSerializer;", "Lio/github/jan/supabase/SupabaseSerializer;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lkotlinx/serialization/json/Json;)V", "encode", "", "T", "", LinkHeader.Parameters.Type, "Lkotlin/reflect/KType;", "value", "(Lkotlin/reflect/KType;Ljava/lang/Object;)Ljava/lang/String;", "decode", "(Lkotlin/reflect/KType;Ljava/lang/String;)Ljava/lang/Object;", "supabase-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class KotlinXSerializer implements SupabaseSerializer {
    private final d json;

    /* JADX WARN: Multi-variable type inference failed */
    public KotlinXSerializer() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.github.jan.supabase.SupabaseSerializer
    public <T> T decode(InterfaceC1444w interfaceC1444w, String str) {
        l.f(LinkHeader.Parameters.Type, interfaceC1444w);
        l.f("value", str);
        d dVar = this.json;
        T t7 = (T) dVar.b(str, c.N(dVar.f10460b, interfaceC1444w));
        l.d("null cannot be cast to non-null type T of io.github.jan.supabase.serializer.KotlinXSerializer.decode", t7);
        return t7;
    }

    @Override // io.github.jan.supabase.SupabaseSerializer
    public <T> String encode(InterfaceC1444w interfaceC1444w, T t7) {
        l.f(LinkHeader.Parameters.Type, interfaceC1444w);
        l.f("value", t7);
        d dVar = this.json;
        return dVar.d(c.N(dVar.f10460b, interfaceC1444w), t7);
    }

    public KotlinXSerializer(d dVar) {
        l.f("json", dVar);
        this.json = dVar;
    }

    public /* synthetic */ KotlinXSerializer(d dVar, int i7, f fVar) {
        this((i7 & 1) != 0 ? d.f10459d : dVar);
    }
}
