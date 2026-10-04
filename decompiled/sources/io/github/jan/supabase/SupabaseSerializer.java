package io.github.jan.supabase;

import io.ktor.http.LinkHeader;
import kotlin.Metadata;
import l4.InterfaceC1444w;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J'\u0010\u0002\u001a\u00020\u0003\"\b\b\u0000\u0010\u0004*\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u0002H\u0004H&¢\u0006\u0002\u0010\bJ'\u0010\t\u001a\u0002H\u0004\"\b\b\u0000\u0010\u0004*\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003H&¢\u0006\u0002\u0010\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lio/github/jan/supabase/SupabaseSerializer;", "", "encode", "", "T", LinkHeader.Parameters.Type, "Lkotlin/reflect/KType;", "value", "(Lkotlin/reflect/KType;Ljava/lang/Object;)Ljava/lang/String;", "decode", "(Lkotlin/reflect/KType;Ljava/lang/String;)Ljava/lang/Object;", "supabase-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public interface SupabaseSerializer {
    <T> T decode(InterfaceC1444w interfaceC1444w, String str);

    <T> String encode(InterfaceC1444w interfaceC1444w, T t7);
}
