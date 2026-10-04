package io.github.jan.supabase.postgrest.query;

import e4.k;
import io.github.jan.supabase.SupabaseSerializer;
import io.github.jan.supabase.annotations.SupabaseInternal;
import io.github.jan.supabase.postgrest.PropertyConversionMethod;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import kotlinx.serialization.json.c;

@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a7\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\nH\u0087\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000b"}, d2 = {"buildPostgrestUpdate", "Lkotlinx/serialization/json/JsonObject;", "propertyConversionMethod", "Lio/github/jan/supabase/postgrest/PropertyConversionMethod;", "serializer", "Lio/github/jan/supabase/SupabaseSerializer;", "block", "Lkotlin/Function1;", "Lio/github/jan/supabase/postgrest/query/PostgrestUpdate;", "", "Lkotlin/ExtensionFunctionType;", "postgrest-kt_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PostgrestUpdateKt {
    @SupabaseInternal
    public static final c buildPostgrestUpdate(PropertyConversionMethod propertyConversionMethod, SupabaseSerializer supabaseSerializer, k kVar) {
        l.f("propertyConversionMethod", propertyConversionMethod);
        l.f("serializer", supabaseSerializer);
        l.f("block", kVar);
        PostgrestUpdate postgrestUpdate = new PostgrestUpdate(propertyConversionMethod, supabaseSerializer);
        kVar.invoke(postgrestUpdate);
        return postgrestUpdate.toJson();
    }

    public static /* synthetic */ c buildPostgrestUpdate$default(PropertyConversionMethod propertyConversionMethod, SupabaseSerializer supabaseSerializer, k kVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            propertyConversionMethod = PropertyConversionMethod.INSTANCE.getSERIAL_NAME();
        }
        l.f("propertyConversionMethod", propertyConversionMethod);
        l.f("serializer", supabaseSerializer);
        l.f("block", kVar);
        PostgrestUpdate postgrestUpdate = new PostgrestUpdate(propertyConversionMethod, supabaseSerializer);
        kVar.invoke(postgrestUpdate);
        return postgrestUpdate.toJson();
    }
}
