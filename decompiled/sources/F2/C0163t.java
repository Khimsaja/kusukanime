package F2;

import C2.C0034g;
import H1.d0;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c1.AbstractC0751e;
import com.kusukanime.R;
import io.ktor.client.utils.CIOKt;
import j3.AbstractC1314A;
import j3.AbstractC1331q;
import j3.X;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import y1.AbstractC2402y;
import y1.C2393o;
import y1.W;

/* renamed from: F2.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0163t extends FrameLayout {

    /* renamed from: K0, reason: collision with root package name */
    public static final float[] f2387K0;

    /* renamed from: A, reason: collision with root package name */
    public final View f2388A;
    public boolean A0;

    /* renamed from: B, reason: collision with root package name */
    public final TextView f2389B;

    /* renamed from: B0, reason: collision with root package name */
    public int f2390B0;

    /* renamed from: C, reason: collision with root package name */
    public final TextView f2391C;

    /* renamed from: C0, reason: collision with root package name */
    public int f2392C0;

    /* renamed from: D, reason: collision with root package name */
    public final ImageView f2393D;

    /* renamed from: D0, reason: collision with root package name */
    public int f2394D0;

    /* renamed from: E, reason: collision with root package name */
    public final ImageView f2395E;

    /* renamed from: E0, reason: collision with root package name */
    public long[] f2396E0;

    /* renamed from: F, reason: collision with root package name */
    public final ImageView f2397F;

    /* renamed from: F0, reason: collision with root package name */
    public boolean[] f2398F0;

    /* renamed from: G, reason: collision with root package name */
    public final ImageView f2399G;

    /* renamed from: G0, reason: collision with root package name */
    public final long[] f2400G0;

    /* renamed from: H, reason: collision with root package name */
    public final ImageView f2401H;

    /* renamed from: H0, reason: collision with root package name */
    public final boolean[] f2402H0;
    public final ImageView I;

    /* renamed from: I0, reason: collision with root package name */
    public long f2403I0;
    public final View J;

    /* renamed from: J0, reason: collision with root package name */
    public boolean f2404J0;

    /* renamed from: K, reason: collision with root package name */
    public final View f2405K;

    /* renamed from: L, reason: collision with root package name */
    public final View f2406L;

    /* renamed from: M, reason: collision with root package name */
    public final TextView f2407M;

    /* renamed from: N, reason: collision with root package name */
    public final TextView f2408N;

    /* renamed from: O, reason: collision with root package name */
    public final M f2409O;

    /* renamed from: P, reason: collision with root package name */
    public final StringBuilder f2410P;

    /* renamed from: Q, reason: collision with root package name */
    public final Formatter f2411Q;

    /* renamed from: R, reason: collision with root package name */
    public final y1.N f2412R;

    /* renamed from: S, reason: collision with root package name */
    public final y1.O f2413S;

    /* renamed from: T, reason: collision with root package name */
    public final B1.w f2414T;

    /* renamed from: U, reason: collision with root package name */
    public final Drawable f2415U;

    /* renamed from: V, reason: collision with root package name */
    public final Drawable f2416V;

    /* renamed from: W, reason: collision with root package name */
    public final Drawable f2417W;

    /* renamed from: a0, reason: collision with root package name */
    public final Drawable f2418a0;

    /* renamed from: b0, reason: collision with root package name */
    public final Drawable f2419b0;

    /* renamed from: c0, reason: collision with root package name */
    public final String f2420c0;

    /* renamed from: d0, reason: collision with root package name */
    public final String f2421d0;

    /* renamed from: e0, reason: collision with root package name */
    public final String f2422e0;

    /* renamed from: f0, reason: collision with root package name */
    public final Drawable f2423f0;

    /* renamed from: g0, reason: collision with root package name */
    public final Drawable f2424g0;

    /* renamed from: h0, reason: collision with root package name */
    public final float f2425h0;

    /* renamed from: i0, reason: collision with root package name */
    public final float f2426i0;

    /* renamed from: j0, reason: collision with root package name */
    public final String f2427j0;

    /* renamed from: k, reason: collision with root package name */
    public final y f2428k;

    /* renamed from: k0, reason: collision with root package name */
    public final String f2429k0;

    /* renamed from: l, reason: collision with root package name */
    public final Resources f2430l;

    /* renamed from: l0, reason: collision with root package name */
    public final Drawable f2431l0;

    /* renamed from: m, reason: collision with root package name */
    public final ViewOnClickListenerC0153i f2432m;

    /* renamed from: m0, reason: collision with root package name */
    public final Drawable f2433m0;

    /* renamed from: n, reason: collision with root package name */
    public final CopyOnWriteArrayList f2434n;

    /* renamed from: n0, reason: collision with root package name */
    public final String f2435n0;

    /* renamed from: o, reason: collision with root package name */
    public final RecyclerView f2436o;

    /* renamed from: o0, reason: collision with root package name */
    public final String f2437o0;

    /* renamed from: p, reason: collision with root package name */
    public final C0159o f2438p;

    /* renamed from: p0, reason: collision with root package name */
    public final Drawable f2439p0;

    /* renamed from: q, reason: collision with root package name */
    public final C0156l f2440q;

    /* renamed from: q0, reason: collision with root package name */
    public final Drawable f2441q0;

    /* renamed from: r, reason: collision with root package name */
    public final C0152h f2442r;

    /* renamed from: r0, reason: collision with root package name */
    public final String f2443r0;

    /* renamed from: s, reason: collision with root package name */
    public final C0152h f2444s;

    /* renamed from: s0, reason: collision with root package name */
    public final String f2445s0;

    /* renamed from: t, reason: collision with root package name */
    public final C0034g f2446t;

    /* renamed from: t0, reason: collision with root package name */
    public y1.L f2447t0;

    /* renamed from: u, reason: collision with root package name */
    public final PopupWindow f2448u;

    /* renamed from: u0, reason: collision with root package name */
    public InterfaceC0154j f2449u0;

    /* renamed from: v, reason: collision with root package name */
    public final int f2450v;
    public boolean v0;

    /* renamed from: w, reason: collision with root package name */
    public final ImageView f2451w;

    /* renamed from: w0, reason: collision with root package name */
    public boolean f2452w0;

    /* renamed from: x, reason: collision with root package name */
    public final ImageView f2453x;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f2454x0;

    /* renamed from: y, reason: collision with root package name */
    public final ImageView f2455y;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f2456y0;

    /* renamed from: z, reason: collision with root package name */
    public final View f2457z;

    /* renamed from: z0, reason: collision with root package name */
    public boolean f2458z0;

    static {
        AbstractC2402y.a("media3.ui");
        f2387K0 = new float[]{0.25f, 0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0163t(Context context) {
        super(context, null, 0);
        int i7 = 0;
        this.f2456y0 = true;
        this.f2390B0 = 5000;
        this.f2394D0 = 0;
        this.f2392C0 = 200;
        LayoutInflater.from(context).inflate(R.layout.exo_player_control_view, this);
        setDescendantFocusability(262144);
        ViewOnClickListenerC0153i viewOnClickListenerC0153i = new ViewOnClickListenerC0153i(this);
        this.f2432m = viewOnClickListenerC0153i;
        this.f2434n = new CopyOnWriteArrayList();
        this.f2412R = new y1.N();
        this.f2413S = new y1.O();
        StringBuilder sb = new StringBuilder();
        this.f2410P = sb;
        this.f2411Q = new Formatter(sb, Locale.getDefault());
        this.f2396E0 = new long[0];
        this.f2398F0 = new boolean[0];
        this.f2400G0 = new long[0];
        this.f2402H0 = new boolean[0];
        this.f2414T = new B1.w(2, this);
        this.f2407M = (TextView) findViewById(R.id.exo_duration);
        this.f2408N = (TextView) findViewById(R.id.exo_position);
        ImageView imageView = (ImageView) findViewById(R.id.exo_subtitle);
        this.f2399G = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(viewOnClickListenerC0153i);
        }
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_fullscreen);
        this.f2401H = imageView2;
        ViewOnClickListenerC0150f viewOnClickListenerC0150f = new ViewOnClickListenerC0150f(i7, this);
        if (imageView2 != null) {
            imageView2.setVisibility(8);
            imageView2.setOnClickListener(viewOnClickListenerC0150f);
        }
        ImageView imageView3 = (ImageView) findViewById(R.id.exo_minimal_fullscreen);
        this.I = imageView3;
        ViewOnClickListenerC0150f viewOnClickListenerC0150f2 = new ViewOnClickListenerC0150f(i7, this);
        if (imageView3 != null) {
            imageView3.setVisibility(8);
            imageView3.setOnClickListener(viewOnClickListenerC0150f2);
        }
        View viewFindViewById = findViewById(R.id.exo_settings);
        this.J = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(viewOnClickListenerC0153i);
        }
        View viewFindViewById2 = findViewById(R.id.exo_playback_speed);
        this.f2405K = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(viewOnClickListenerC0153i);
        }
        View viewFindViewById3 = findViewById(R.id.exo_audio_track);
        this.f2406L = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(viewOnClickListenerC0153i);
        }
        M m7 = (M) findViewById(R.id.exo_progress);
        View viewFindViewById4 = findViewById(R.id.exo_progress_placeholder);
        if (m7 != null) {
            this.f2409O = m7;
        } else if (viewFindViewById4 != null) {
            C0149e c0149e = new C0149e(context);
            c0149e.setId(R.id.exo_progress);
            c0149e.setLayoutParams(viewFindViewById4.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById4.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById4);
            viewGroup.removeView(viewFindViewById4);
            viewGroup.addView(c0149e, iIndexOfChild);
            this.f2409O = c0149e;
        } else {
            this.f2409O = null;
        }
        M m8 = this.f2409O;
        if (m8 != null) {
            ((C0149e) m8).f2329H.add(viewOnClickListenerC0153i);
        }
        Resources resources = context.getResources();
        this.f2430l = resources;
        ImageView imageView4 = (ImageView) findViewById(R.id.exo_play_pause);
        this.f2455y = imageView4;
        if (imageView4 != null) {
            imageView4.setOnClickListener(viewOnClickListenerC0153i);
        }
        ImageView imageView5 = (ImageView) findViewById(R.id.exo_prev);
        this.f2451w = imageView5;
        if (imageView5 != null) {
            imageView5.setImageDrawable(resources.getDrawable(R.drawable.exo_styled_controls_previous, context.getTheme()));
            imageView5.setOnClickListener(viewOnClickListenerC0153i);
        }
        ImageView imageView6 = (ImageView) findViewById(R.id.exo_next);
        this.f2453x = imageView6;
        if (imageView6 != null) {
            imageView6.setImageDrawable(resources.getDrawable(R.drawable.exo_styled_controls_next, context.getTheme()));
            imageView6.setOnClickListener(viewOnClickListenerC0153i);
        }
        int i8 = AbstractC0751e.a;
        Typeface typefaceA = context.isRestricted() ? null : AbstractC0751e.a(context, R.font.roboto_medium_numbers, new TypedValue(), null);
        ImageView imageView7 = (ImageView) findViewById(R.id.exo_rew);
        TextView textView = (TextView) findViewById(R.id.exo_rew_with_amount);
        if (imageView7 != null) {
            imageView7.setImageDrawable(resources.getDrawable(R.drawable.exo_styled_controls_simple_rewind, context.getTheme()));
            this.f2388A = imageView7;
            this.f2391C = null;
        } else if (textView != null) {
            textView.setTypeface(typefaceA);
            this.f2391C = textView;
            this.f2388A = textView;
        } else {
            this.f2391C = null;
            this.f2388A = null;
        }
        View view = this.f2388A;
        if (view != null) {
            view.setOnClickListener(viewOnClickListenerC0153i);
        }
        ImageView imageView8 = (ImageView) findViewById(R.id.exo_ffwd);
        TextView textView2 = (TextView) findViewById(R.id.exo_ffwd_with_amount);
        if (imageView8 != null) {
            imageView8.setImageDrawable(resources.getDrawable(R.drawable.exo_styled_controls_simple_fastforward, context.getTheme()));
            this.f2457z = imageView8;
            this.f2389B = null;
        } else if (textView2 != null) {
            textView2.setTypeface(typefaceA);
            this.f2389B = textView2;
            this.f2457z = textView2;
        } else {
            this.f2389B = null;
            this.f2457z = null;
        }
        View view2 = this.f2457z;
        if (view2 != null) {
            view2.setOnClickListener(viewOnClickListenerC0153i);
        }
        ImageView imageView9 = (ImageView) findViewById(R.id.exo_repeat_toggle);
        this.f2393D = imageView9;
        if (imageView9 != null) {
            imageView9.setOnClickListener(viewOnClickListenerC0153i);
        }
        ImageView imageView10 = (ImageView) findViewById(R.id.exo_shuffle);
        this.f2395E = imageView10;
        if (imageView10 != null) {
            imageView10.setOnClickListener(viewOnClickListenerC0153i);
        }
        this.f2425h0 = resources.getInteger(R.integer.exo_media_button_opacity_percentage_enabled) / 100.0f;
        this.f2426i0 = resources.getInteger(R.integer.exo_media_button_opacity_percentage_disabled) / 100.0f;
        ImageView imageView11 = (ImageView) findViewById(R.id.exo_vr);
        this.f2397F = imageView11;
        if (imageView11 != null) {
            imageView11.setImageDrawable(resources.getDrawable(R.drawable.exo_styled_controls_vr, context.getTheme()));
            j(imageView11, false);
        }
        y yVar = new y(this);
        this.f2428k = yVar;
        yVar.f2467C = true;
        C0159o c0159o = new C0159o(this, new String[]{resources.getString(R.string.exo_controls_playback_speed), resources.getString(R.string.exo_track_selection_title_audio)}, new Drawable[]{resources.getDrawable(R.drawable.exo_styled_controls_speed, context.getTheme()), resources.getDrawable(R.drawable.exo_styled_controls_audiotrack, context.getTheme())});
        this.f2438p = c0159o;
        this.f2450v = resources.getDimensionPixelSize(R.dimen.exo_settings_offset);
        RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(context).inflate(R.layout.exo_styled_settings_list, (ViewGroup) null);
        this.f2436o = recyclerView;
        recyclerView.setAdapter(c0159o);
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        PopupWindow popupWindow = new PopupWindow((View) recyclerView, -2, -2, true);
        this.f2448u = popupWindow;
        if (B1.K.a < 23) {
            popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        }
        popupWindow.setOnDismissListener(viewOnClickListenerC0153i);
        this.f2404J0 = true;
        this.f2446t = new C0034g(getResources());
        this.f2431l0 = resources.getDrawable(R.drawable.exo_styled_controls_subtitle_on, context.getTheme());
        this.f2433m0 = resources.getDrawable(R.drawable.exo_styled_controls_subtitle_off, context.getTheme());
        this.f2435n0 = resources.getString(R.string.exo_controls_cc_enabled_description);
        this.f2437o0 = resources.getString(R.string.exo_controls_cc_disabled_description);
        this.f2442r = new C0152h(this, 1);
        this.f2444s = new C0152h(this, 0);
        this.f2440q = new C0156l(this, resources.getStringArray(R.array.exo_controls_playback_speeds), f2387K0);
        this.f2415U = resources.getDrawable(R.drawable.exo_styled_controls_play, context.getTheme());
        this.f2416V = resources.getDrawable(R.drawable.exo_styled_controls_pause, context.getTheme());
        this.f2439p0 = resources.getDrawable(R.drawable.exo_styled_controls_fullscreen_exit, context.getTheme());
        this.f2441q0 = resources.getDrawable(R.drawable.exo_styled_controls_fullscreen_enter, context.getTheme());
        this.f2417W = resources.getDrawable(R.drawable.exo_styled_controls_repeat_off, context.getTheme());
        this.f2418a0 = resources.getDrawable(R.drawable.exo_styled_controls_repeat_one, context.getTheme());
        this.f2419b0 = resources.getDrawable(R.drawable.exo_styled_controls_repeat_all, context.getTheme());
        this.f2423f0 = resources.getDrawable(R.drawable.exo_styled_controls_shuffle_on, context.getTheme());
        this.f2424g0 = resources.getDrawable(R.drawable.exo_styled_controls_shuffle_off, context.getTheme());
        this.f2443r0 = resources.getString(R.string.exo_controls_fullscreen_exit_description);
        this.f2445s0 = resources.getString(R.string.exo_controls_fullscreen_enter_description);
        this.f2420c0 = resources.getString(R.string.exo_controls_repeat_off_description);
        this.f2421d0 = resources.getString(R.string.exo_controls_repeat_one_description);
        this.f2422e0 = resources.getString(R.string.exo_controls_repeat_all_description);
        this.f2427j0 = resources.getString(R.string.exo_controls_shuffle_on_description);
        this.f2429k0 = resources.getString(R.string.exo_controls_shuffle_off_description);
        yVar.h((ViewGroup) findViewById(R.id.exo_bottom_bar), true);
        yVar.h(this.f2457z, true);
        yVar.h(this.f2388A, true);
        yVar.h(imageView5, true);
        yVar.h(imageView6, true);
        int i9 = 0;
        yVar.h(imageView10, false);
        yVar.h(imageView, false);
        yVar.h(imageView11, false);
        yVar.h(imageView9, this.f2394D0 != 0);
        addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC0151g(i9, this));
    }

    public static boolean b(y1.L l7, y1.O o7) {
        y1.P pU0;
        int iO;
        Q4.c cVar = (Q4.c) l7;
        if (!cVar.y0(17) || (iO = (pU0 = ((H1.G) cVar).U0()).o()) <= 1 || iO > 100) {
            return false;
        }
        for (int i7 = 0; i7 < iO; i7++) {
            if (pU0.m(i7, o7, 0L).f17965l == -9223372036854775807L) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaybackSpeed(float f5) {
        y1.L l7 = this.f2447t0;
        if (l7 == null || !((Q4.c) l7).y0(13)) {
            return;
        }
        H1.G g4 = (H1.G) this.f2447t0;
        g4.u1();
        g4.m1(new y1.G(f5, g4.f3264q0.f3439o.f17937b));
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(android.view.KeyEvent r14) {
        /*
            r13 = this;
            int r0 = r14.getKeyCode()
            y1.L r1 = r13.f2447t0
            r2 = 0
            if (r1 == 0) goto Lcf
            r3 = 88
            r4 = 87
            r5 = 127(0x7f, float:1.78E-43)
            r6 = 126(0x7e, float:1.77E-43)
            r7 = 79
            r8 = 85
            r9 = 89
            r10 = 90
            if (r0 == r10) goto L29
            if (r0 == r9) goto L29
            if (r0 == r8) goto L29
            if (r0 == r7) goto L29
            if (r0 == r6) goto L29
            if (r0 == r5) goto L29
            if (r0 == r4) goto L29
            if (r0 != r3) goto Lcf
        L29:
            int r11 = r14.getAction()
            r12 = 1
            if (r11 != 0) goto Lce
            if (r0 != r10) goto L53
            r14 = r1
            H1.G r14 = (H1.G) r14
            int r14 = r14.Z0()
            r0 = 4
            if (r14 == r0) goto Lce
            Q4.c r1 = (Q4.c) r1
            r14 = 12
            boolean r0 = r1.y0(r14)
            if (r0 == 0) goto Lce
            r0 = r1
            H1.G r0 = (H1.G) r0
            r0.u1()
            long r2 = r0.f3223F
            r1.F0(r14, r2)
            goto Lce
        L53:
            if (r0 != r9) goto L6d
            r9 = r1
            Q4.c r9 = (Q4.c) r9
            r10 = 11
            boolean r11 = r9.y0(r10)
            if (r11 == 0) goto L6d
            r14 = r9
            H1.G r14 = (H1.G) r14
            r14.u1()
            long r0 = r14.f3222E
            long r0 = -r0
            r9.F0(r10, r0)
            goto Lce
        L6d:
            int r14 = r14.getRepeatCount()
            if (r14 != 0) goto Lce
            if (r0 == r7) goto Lb2
            if (r0 == r8) goto Lb2
            if (r0 == r4) goto La4
            if (r0 == r3) goto L97
            if (r0 == r6) goto L93
            if (r0 == r5) goto L80
            goto Lce
        L80:
            int r14 = B1.K.a
            Q4.c r1 = (Q4.c) r1
            boolean r14 = r1.y0(r12)
            if (r14 == 0) goto Lce
            H1.G r1 = (H1.G) r1
            r1.u1()
            r1.r1(r12, r2)
            goto Lce
        L93:
            B1.K.y(r1)
            goto Lce
        L97:
            Q4.c r1 = (Q4.c) r1
            r14 = 7
            boolean r14 = r1.y0(r14)
            if (r14 == 0) goto Lce
            r1.G0()
            goto Lce
        La4:
            Q4.c r1 = (Q4.c) r1
            r14 = 9
            boolean r14 = r1.y0(r14)
            if (r14 == 0) goto Lce
            r1.E0()
            goto Lce
        Lb2:
            boolean r14 = r13.f2456y0
            boolean r14 = B1.K.N(r1, r14)
            if (r14 == 0) goto Lbe
            B1.K.y(r1)
            goto Lce
        Lbe:
            Q4.c r1 = (Q4.c) r1
            boolean r14 = r1.y0(r12)
            if (r14 == 0) goto Lce
            H1.G r1 = (H1.G) r1
            r1.u1()
            r1.r1(r12, r2)
        Lce:
            return r12
        Lcf:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: F2.C0163t.c(android.view.KeyEvent):boolean");
    }

    public final void d(K2.A a, View view) {
        this.f2436o.setAdapter(a);
        q();
        this.f2404J0 = false;
        PopupWindow popupWindow = this.f2448u;
        popupWindow.dismiss();
        this.f2404J0 = true;
        int width = getWidth() - popupWindow.getWidth();
        int i7 = this.f2450v;
        popupWindow.showAsDropDown(view, width - i7, (-popupWindow.getHeight()) - i7);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return c(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public final X e(y1.X x7, int i7) {
        AbstractC1331q.b(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        j3.G g4 = x7.a;
        int i8 = 0;
        for (int i9 = 0; i9 < g4.size(); i9++) {
            W w7 = (W) g4.get(i9);
            if (w7.f18012b.f17970c == i7) {
                for (int i10 = 0; i10 < w7.a; i10++) {
                    if (w7.a(i10)) {
                        C2393o c2393o = w7.f18012b.f17971d[i10];
                        if ((c2393o.f18103e & 2) == 0) {
                            C0161q c0161q = new C0161q(x7, i9, i10, this.f2446t.o(c2393o));
                            int i11 = i8 + 1;
                            int iE = AbstractC1314A.e(objArrCopyOf.length, i11);
                            if (iE > objArrCopyOf.length) {
                                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iE);
                            }
                            objArrCopyOf[i8] = c0161q;
                            i8 = i11;
                        }
                    }
                }
            }
        }
        return j3.G.q(i8, objArrCopyOf);
    }

    public final void f() {
        y yVar = this.f2428k;
        int i7 = yVar.f2492z;
        if (i7 == 3 || i7 == 2) {
            return;
        }
        yVar.f();
        if (!yVar.f2467C) {
            yVar.i(2);
        } else if (yVar.f2492z == 1) {
            yVar.f2479m.start();
        } else {
            yVar.f2480n.start();
        }
    }

    public final boolean g() {
        y yVar = this.f2428k;
        return yVar.f2492z == 0 && yVar.a.h();
    }

    public y1.L getPlayer() {
        return this.f2447t0;
    }

    public int getRepeatToggleModes() {
        return this.f2394D0;
    }

    public boolean getShowShuffleButton() {
        return this.f2428k.b(this.f2395E);
    }

    public boolean getShowSubtitleButton() {
        return this.f2428k.b(this.f2399G);
    }

    public int getShowTimeoutMs() {
        return this.f2390B0;
    }

    public boolean getShowVrButton() {
        return this.f2428k.b(this.f2397F);
    }

    public final boolean h() {
        return getVisibility() == 0;
    }

    public final void i() {
        m();
        l();
        p();
        r();
        t();
        n();
        s();
    }

    public final void j(View view, boolean z7) {
        if (view == null) {
            return;
        }
        view.setEnabled(z7);
        view.setAlpha(z7 ? this.f2425h0 : this.f2426i0);
    }

    public final void k(boolean z7) {
        if (this.v0 == z7) {
            return;
        }
        this.v0 = z7;
        String str = this.f2445s0;
        Drawable drawable = this.f2441q0;
        String str2 = this.f2443r0;
        Drawable drawable2 = this.f2439p0;
        ImageView imageView = this.f2401H;
        if (imageView != null) {
            if (z7) {
                imageView.setImageDrawable(drawable2);
                imageView.setContentDescription(str2);
            } else {
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
            }
        }
        ImageView imageView2 = this.I;
        if (imageView2 != null) {
            if (z7) {
                imageView2.setImageDrawable(drawable2);
                imageView2.setContentDescription(str2);
            } else {
                imageView2.setImageDrawable(drawable);
                imageView2.setContentDescription(str);
            }
        }
        InterfaceC0154j interfaceC0154j = this.f2449u0;
        if (interfaceC0154j != null) {
            ((A) interfaceC0154j).f2228c.getClass();
        }
    }

    public final void l() {
        boolean zY0;
        boolean zY02;
        boolean zY03;
        boolean zY04;
        boolean zY05;
        long j7;
        long j8;
        if (h() && this.f2452w0) {
            y1.L l7 = this.f2447t0;
            if (l7 != null) {
                zY0 = (this.f2454x0 && b(l7, this.f2413S)) ? ((Q4.c) l7).y0(10) : ((Q4.c) l7).y0(5);
                Q4.c cVar = (Q4.c) l7;
                zY03 = cVar.y0(7);
                zY04 = cVar.y0(11);
                zY05 = cVar.y0(12);
                zY02 = cVar.y0(9);
            } else {
                zY0 = false;
                zY02 = false;
                zY03 = false;
                zY04 = false;
                zY05 = false;
            }
            Resources resources = this.f2430l;
            View view = this.f2388A;
            if (zY04) {
                y1.L l8 = this.f2447t0;
                if (l8 != null) {
                    H1.G g4 = (H1.G) l8;
                    g4.u1();
                    j8 = g4.f3222E;
                } else {
                    j8 = 5000;
                }
                int i7 = (int) (j8 / 1000);
                TextView textView = this.f2391C;
                if (textView != null) {
                    textView.setText(String.valueOf(i7));
                }
                if (view != null) {
                    view.setContentDescription(resources.getQuantityString(R.plurals.exo_controls_rewind_by_amount_description, i7, Integer.valueOf(i7)));
                }
            }
            View view2 = this.f2457z;
            if (zY05) {
                y1.L l9 = this.f2447t0;
                if (l9 != null) {
                    H1.G g7 = (H1.G) l9;
                    g7.u1();
                    j7 = g7.f3223F;
                } else {
                    j7 = 15000;
                }
                int i8 = (int) (j7 / 1000);
                TextView textView2 = this.f2389B;
                if (textView2 != null) {
                    textView2.setText(String.valueOf(i8));
                }
                if (view2 != null) {
                    view2.setContentDescription(resources.getQuantityString(R.plurals.exo_controls_fastforward_by_amount_description, i8, Integer.valueOf(i8)));
                }
            }
            j(this.f2451w, zY03);
            j(view, zY04);
            j(view2, zY05);
            j(this.f2453x, zY02);
            M m7 = this.f2409O;
            if (m7 != null) {
                ((C0149e) m7).setEnabled(zY0);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m() {
        /*
            r5 = this;
            boolean r0 = r5.h()
            if (r0 == 0) goto L5a
            boolean r0 = r5.f2452w0
            if (r0 != 0) goto Lb
            goto L5a
        Lb:
            android.widget.ImageView r0 = r5.f2455y
            if (r0 == 0) goto L5a
            y1.L r1 = r5.f2447t0
            boolean r2 = r5.f2456y0
            boolean r1 = B1.K.N(r1, r2)
            if (r1 == 0) goto L1c
            android.graphics.drawable.Drawable r2 = r5.f2415U
            goto L1e
        L1c:
            android.graphics.drawable.Drawable r2 = r5.f2416V
        L1e:
            if (r1 == 0) goto L24
            r1 = 2131492907(0x7f0c002b, float:1.860928E38)
            goto L27
        L24:
            r1 = 2131492906(0x7f0c002a, float:1.8609277E38)
        L27:
            r0.setImageDrawable(r2)
            android.content.res.Resources r2 = r5.f2430l
            java.lang.String r1 = r2.getString(r1)
            r0.setContentDescription(r1)
            y1.L r1 = r5.f2447t0
            if (r1 == 0) goto L56
            r2 = r1
            Q4.c r2 = (Q4.c) r2
            r3 = 1
            boolean r4 = r2.y0(r3)
            if (r4 == 0) goto L56
            r4 = 17
            boolean r2 = r2.y0(r4)
            if (r2 == 0) goto L57
            H1.G r1 = (H1.G) r1
            y1.P r1 = r1.U0()
            boolean r1 = r1.p()
            if (r1 != 0) goto L56
            goto L57
        L56:
            r3 = 0
        L57:
            r5.j(r0, r3)
        L5a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: F2.C0163t.m():void");
    }

    public final void n() {
        C0156l c0156l;
        y1.L l7 = this.f2447t0;
        if (l7 == null) {
            return;
        }
        H1.G g4 = (H1.G) l7;
        g4.u1();
        float f5 = g4.f3264q0.f3439o.a;
        float f7 = Float.MAX_VALUE;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            c0156l = this.f2440q;
            float[] fArr = c0156l.f2369d;
            if (i7 >= fArr.length) {
                break;
            }
            float fAbs = Math.abs(f5 - fArr[i7]);
            if (fAbs < f7) {
                i8 = i7;
                f7 = fAbs;
            }
            i7++;
        }
        c0156l.f2370e = i8;
        String str = c0156l.f2368c[i8];
        C0159o c0159o = this.f2438p;
        c0159o.f2377d[0] = str;
        j(this.J, c0159o.d(1) || c0159o.d(0));
    }

    public final void o() {
        long j7;
        long jP;
        if (h() && this.f2452w0) {
            y1.L l7 = this.f2447t0;
            long j8 = 0;
            if (l7 == null || !((Q4.c) l7).y0(16)) {
                j7 = 0;
            } else {
                long j9 = this.f2403I0;
                H1.G g4 = (H1.G) l7;
                g4.u1();
                long jO0 = g4.O0(g4.f3264q0) + j9;
                long j10 = this.f2403I0;
                g4.u1();
                if (g4.f3264q0.a.p()) {
                    jP = g4.f3268s0;
                } else {
                    d0 d0Var = g4.f3264q0;
                    if (d0Var.f3435k.f7254d != d0Var.f3426b.f7254d) {
                        jP = B1.K.P(d0Var.a.m(g4.R0(), (y1.O) g4.f8011k, 0L).f17965l);
                    } else {
                        long j11 = d0Var.f3441q;
                        if (g4.f3264q0.f3435k.b()) {
                            d0 d0Var2 = g4.f3264q0;
                            d0Var2.a.g(d0Var2.f3435k.a, g4.f3274y).d(g4.f3264q0.f3435k.f7252b);
                        } else {
                            j8 = j11;
                        }
                        d0 d0Var3 = g4.f3264q0;
                        y1.P p7 = d0Var3.a;
                        Object obj = d0Var3.f3435k.a;
                        y1.N n7 = g4.f3274y;
                        p7.g(obj, n7);
                        jP = B1.K.P(j8 + n7.f17950e);
                    }
                }
                j7 = jP + j10;
                j8 = jO0;
            }
            TextView textView = this.f2408N;
            if (textView != null && !this.A0) {
                textView.setText(B1.K.v(this.f2410P, this.f2411Q, j8));
            }
            M m7 = this.f2409O;
            if (m7 != null) {
                ((C0149e) m7).setPosition(j8);
                ((C0149e) this.f2409O).setBufferedPosition(j7);
            }
            removeCallbacks(this.f2414T);
            int iZ0 = l7 == null ? 1 : ((H1.G) l7).Z0();
            if (l7 != null) {
                H1.G g7 = (H1.G) ((Q4.c) l7);
                if (g7.Z0() == 3 && g7.Y0()) {
                    g7.u1();
                    if (g7.f3264q0.f3438n == 0) {
                        M m8 = this.f2409O;
                        long jMin = Math.min(m8 != null ? ((C0149e) m8).getPreferredUpdateDelay() : 1000L, 1000 - (j8 % 1000));
                        H1.G g8 = (H1.G) l7;
                        g8.u1();
                        float f5 = g8.f3264q0.f3439o.a;
                        postDelayed(this.f2414T, B1.K.i(f5 > 0.0f ? (long) (jMin / f5) : 1000L, this.f2392C0, 1000L));
                        return;
                    }
                }
            }
            if (iZ0 == 4 || iZ0 == 1) {
                return;
            }
            postDelayed(this.f2414T, 1000L);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        y yVar = this.f2428k;
        yVar.a.addOnLayoutChangeListener(yVar.f2490x);
        this.f2452w0 = true;
        if (g()) {
            yVar.g();
        }
        i();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        y yVar = this.f2428k;
        yVar.a.removeOnLayoutChangeListener(yVar.f2490x);
        this.f2452w0 = false;
        removeCallbacks(this.f2414T);
        yVar.f();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        super.onLayout(z7, i7, i8, i9, i10);
        View view = this.f2428k.f2468b;
        if (view != null) {
            view.layout(0, 0, i9 - i7, i10 - i8);
        }
    }

    public final void p() {
        ImageView imageView;
        if (h() && this.f2452w0 && (imageView = this.f2393D) != null) {
            if (this.f2394D0 == 0) {
                j(imageView, false);
                return;
            }
            y1.L l7 = this.f2447t0;
            String str = this.f2420c0;
            Drawable drawable = this.f2417W;
            if (l7 == null || !((Q4.c) l7).y0(15)) {
                j(imageView, false);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            j(imageView, true);
            H1.G g4 = (H1.G) l7;
            g4.u1();
            int i7 = g4.f3231P;
            if (i7 == 0) {
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
            } else if (i7 == 1) {
                imageView.setImageDrawable(this.f2418a0);
                imageView.setContentDescription(this.f2421d0);
            } else {
                if (i7 != 2) {
                    return;
                }
                imageView.setImageDrawable(this.f2419b0);
                imageView.setContentDescription(this.f2422e0);
            }
        }
    }

    public final void q() {
        RecyclerView recyclerView = this.f2436o;
        recyclerView.measure(0, 0);
        int width = getWidth();
        int i7 = this.f2450v;
        int iMin = Math.min(recyclerView.getMeasuredWidth(), width - (i7 * 2));
        PopupWindow popupWindow = this.f2448u;
        popupWindow.setWidth(iMin);
        popupWindow.setHeight(Math.min(getHeight() - (i7 * 2), recyclerView.getMeasuredHeight()));
    }

    public final void r() {
        ImageView imageView;
        if (h() && this.f2452w0 && (imageView = this.f2395E) != null) {
            y1.L l7 = this.f2447t0;
            if (!this.f2428k.b(imageView)) {
                j(imageView, false);
                return;
            }
            String str = this.f2429k0;
            Drawable drawable = this.f2424g0;
            if (l7 == null || !((Q4.c) l7).y0(14)) {
                j(imageView, false);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            j(imageView, true);
            H1.G g4 = (H1.G) l7;
            g4.u1();
            if (g4.f3232Q) {
                drawable = this.f2423f0;
            }
            imageView.setImageDrawable(drawable);
            g4.u1();
            if (g4.f3232Q) {
                str = this.f2427j0;
            }
            imageView.setContentDescription(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s() {
        /*
            Method dump skipped, instructions count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: F2.C0163t.s():void");
    }

    public void setAnimationEnabled(boolean z7) {
        this.f2428k.f2467C = z7;
    }

    @Deprecated
    public void setOnFullScreenModeChangedListener(InterfaceC0154j interfaceC0154j) {
        this.f2449u0 = interfaceC0154j;
        boolean z7 = interfaceC0154j != null;
        ImageView imageView = this.f2401H;
        if (imageView != null) {
            if (z7) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(8);
            }
        }
        boolean z8 = interfaceC0154j != null;
        ImageView imageView2 = this.I;
        if (imageView2 == null) {
            return;
        }
        if (z8) {
            imageView2.setVisibility(0);
        } else {
            imageView2.setVisibility(8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setPlayer(y1.L r5) {
        /*
            r4 = this;
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r2 = 0
            r3 = 1
            if (r0 != r1) goto Le
            r0 = r3
            goto Lf
        Le:
            r0 = r2
        Lf:
            B1.AbstractC0015b.h(r0)
            if (r5 == 0) goto L1f
            r0 = r5
            H1.G r0 = (H1.G) r0
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            android.os.Looper r0 = r0.f3220C
            if (r0 != r1) goto L20
        L1f:
            r2 = r3
        L20:
            B1.AbstractC0015b.c(r2)
            y1.L r0 = r4.f2447t0
            if (r0 != r5) goto L28
            return
        L28:
            F2.i r1 = r4.f2432m
            if (r0 == 0) goto L31
            H1.G r0 = (H1.G) r0
            r0.i1(r1)
        L31:
            r4.f2447t0 = r5
            if (r5 == 0) goto L3f
            H1.G r5 = (H1.G) r5
            r1.getClass()
            B1.q r5 = r5.f3272w
            r5.a(r1)
        L3f:
            r4.i()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: F2.C0163t.setPlayer(y1.L):void");
    }

    public void setRepeatToggleModes(int i7) {
        this.f2394D0 = i7;
        y1.L l7 = this.f2447t0;
        if (l7 != null && ((Q4.c) l7).y0(15)) {
            H1.G g4 = (H1.G) this.f2447t0;
            g4.u1();
            int i8 = g4.f3231P;
            if (i7 == 0 && i8 != 0) {
                ((H1.G) this.f2447t0).n1(0);
            } else if (i7 == 1 && i8 == 2) {
                ((H1.G) this.f2447t0).n1(1);
            } else if (i7 == 2 && i8 == 1) {
                ((H1.G) this.f2447t0).n1(2);
            }
        }
        this.f2428k.h(this.f2393D, i7 != 0);
        p();
    }

    public void setShowFastForwardButton(boolean z7) {
        this.f2428k.h(this.f2457z, z7);
        l();
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z7) {
        this.f2454x0 = z7;
        s();
    }

    public void setShowNextButton(boolean z7) {
        this.f2428k.h(this.f2453x, z7);
        l();
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z7) {
        this.f2456y0 = z7;
        m();
    }

    public void setShowPreviousButton(boolean z7) {
        this.f2428k.h(this.f2451w, z7);
        l();
    }

    public void setShowRewindButton(boolean z7) {
        this.f2428k.h(this.f2388A, z7);
        l();
    }

    public void setShowShuffleButton(boolean z7) {
        this.f2428k.h(this.f2395E, z7);
        r();
    }

    public void setShowSubtitleButton(boolean z7) {
        this.f2428k.h(this.f2399G, z7);
    }

    public void setShowTimeoutMs(int i7) {
        this.f2390B0 = i7;
        if (g()) {
            this.f2428k.g();
        }
    }

    public void setShowVrButton(boolean z7) {
        this.f2428k.h(this.f2397F, z7);
    }

    public void setTimeBarMinUpdateInterval(int i7) {
        this.f2392C0 = B1.K.h(i7, 16, CIOKt.DEFAULT_HTTP_POOL_SIZE);
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
        ImageView imageView = this.f2397F;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
            j(imageView, onClickListener != null);
        }
    }

    public final void t() {
        C0152h c0152h = this.f2442r;
        c0152h.getClass();
        List list = Collections.EMPTY_LIST;
        c0152h.f2363c = list;
        C0152h c0152h2 = this.f2444s;
        c0152h2.getClass();
        c0152h2.f2363c = list;
        y1.L l7 = this.f2447t0;
        ImageView imageView = this.f2399G;
        if (l7 != null && ((Q4.c) l7).y0(30) && ((Q4.c) this.f2447t0).y0(29)) {
            y1.X xV0 = ((H1.G) this.f2447t0).V0();
            X xE = e(xV0, 1);
            c0152h2.f2363c = xE;
            C0163t c0163t = c0152h2.f2366f;
            y1.L l8 = c0163t.f2447t0;
            l8.getClass();
            Q1.j jVarB1 = ((H1.G) l8).b1();
            boolean zIsEmpty = xE.isEmpty();
            C0159o c0159o = c0163t.f2438p;
            if (!zIsEmpty) {
                if (c0152h2.d(jVarB1)) {
                    int i7 = 0;
                    while (true) {
                        if (i7 >= xE.f12306n) {
                            break;
                        }
                        C0161q c0161q = (C0161q) xE.get(i7);
                        if (c0161q.a.f18015e[c0161q.f2382b]) {
                            c0159o.f2377d[1] = c0161q.f2383c;
                            break;
                        }
                        i7++;
                    }
                } else {
                    c0159o.f2377d[1] = c0163t.getResources().getString(R.string.exo_track_selection_auto);
                }
            } else {
                c0159o.f2377d[1] = c0163t.getResources().getString(R.string.exo_track_selection_none);
            }
            if (this.f2428k.b(imageView)) {
                c0152h.e(e(xV0, 3));
            } else {
                c0152h.e(X.f12304o);
            }
        }
        j(imageView, c0152h.a() > 0);
        C0159o c0159o2 = this.f2438p;
        j(this.J, c0159o2.d(1) || c0159o2.d(0));
    }

    public void setProgressUpdateListener(InterfaceC0157m interfaceC0157m) {
    }
}
