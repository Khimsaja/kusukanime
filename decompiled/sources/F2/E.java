package F2;

import B1.AbstractC0015b;
import B1.RunnableC0016c;
import C2.C0034g;
import H1.C0234o;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.SurfaceSyncGroup;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.image.ImageOutput;
import androidx.media3.ui.AspectRatioFrameLayout;
import androidx.media3.ui.SubtitleView;
import com.kusukanime.R;
import i1.C1055h;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import y1.InterfaceC2390l;
import y1.b0;

/* loaded from: classes.dex */
public final class E extends FrameLayout {

    /* renamed from: A, reason: collision with root package name */
    public final Method f2230A;

    /* renamed from: B, reason: collision with root package name */
    public final Object f2231B;

    /* renamed from: C, reason: collision with root package name */
    public y1.L f2232C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f2233D;

    /* renamed from: E, reason: collision with root package name */
    public B f2234E;

    /* renamed from: F, reason: collision with root package name */
    public InterfaceC0162s f2235F;

    /* renamed from: G, reason: collision with root package name */
    public int f2236G;

    /* renamed from: H, reason: collision with root package name */
    public int f2237H;
    public Drawable I;
    public int J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f2238K;

    /* renamed from: L, reason: collision with root package name */
    public CharSequence f2239L;

    /* renamed from: M, reason: collision with root package name */
    public int f2240M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f2241N;

    /* renamed from: O, reason: collision with root package name */
    public boolean f2242O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f2243P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f2244Q;

    /* renamed from: k, reason: collision with root package name */
    public final A f2245k;

    /* renamed from: l, reason: collision with root package name */
    public final AspectRatioFrameLayout f2246l;

    /* renamed from: m, reason: collision with root package name */
    public final View f2247m;

    /* renamed from: n, reason: collision with root package name */
    public final View f2248n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f2249o;

    /* renamed from: p, reason: collision with root package name */
    public final C0034g f2250p;

    /* renamed from: q, reason: collision with root package name */
    public final ImageView f2251q;

    /* renamed from: r, reason: collision with root package name */
    public final ImageView f2252r;

    /* renamed from: s, reason: collision with root package name */
    public final SubtitleView f2253s;

    /* renamed from: t, reason: collision with root package name */
    public final View f2254t;

    /* renamed from: u, reason: collision with root package name */
    public final TextView f2255u;

    /* renamed from: v, reason: collision with root package name */
    public final C0163t f2256v;

    /* renamed from: w, reason: collision with root package name */
    public final FrameLayout f2257w;

    /* renamed from: x, reason: collision with root package name */
    public final FrameLayout f2258x;

    /* renamed from: y, reason: collision with root package name */
    public final Handler f2259y;

    /* renamed from: z, reason: collision with root package name */
    public final Class f2260z;

    public E(Context context) throws NoSuchMethodException, SecurityException, IllegalArgumentException {
        Class<ExoPlayer> cls;
        Object objNewProxyInstance;
        Method method;
        super(context, null, 0);
        A a = new A(this);
        this.f2245k = a;
        this.f2259y = new Handler(Looper.getMainLooper());
        if (isInEditMode()) {
            this.f2246l = null;
            this.f2247m = null;
            this.f2248n = null;
            this.f2249o = false;
            this.f2250p = null;
            this.f2251q = null;
            this.f2252r = null;
            this.f2253s = null;
            this.f2254t = null;
            this.f2255u = null;
            this.f2256v = null;
            this.f2257w = null;
            this.f2258x = null;
            this.f2260z = null;
            this.f2230A = null;
            this.f2231B = null;
            ImageView imageView = new ImageView(context);
            if (B1.K.a >= 23) {
                Resources resources = getResources();
                imageView.setImageDrawable(resources.getDrawable(R.drawable.exo_edit_mode_logo, context.getTheme()));
                imageView.setBackgroundColor(resources.getColor(R.color.exo_edit_mode_background_color, null));
            } else {
                Resources resources2 = getResources();
                imageView.setImageDrawable(resources2.getDrawable(R.drawable.exo_edit_mode_logo, context.getTheme()));
                imageView.setBackgroundColor(resources2.getColor(R.color.exo_edit_mode_background_color));
            }
            addView(imageView);
            return;
        }
        LayoutInflater.from(context).inflate(R.layout.exo_player_view, this);
        setDescendantFocusability(262144);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(R.id.exo_content_frame);
        this.f2246l = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setResizeMode(0);
        }
        this.f2247m = findViewById(R.id.exo_shutter);
        if (aspectRatioFrameLayout != null) {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            SurfaceView surfaceView = new SurfaceView(context);
            if (B1.K.a >= 34) {
                surfaceView.setSurfaceLifecycle(2);
            }
            this.f2248n = surfaceView;
            surfaceView.setLayoutParams(layoutParams);
            surfaceView.setOnClickListener(a);
            surfaceView.setClickable(false);
            aspectRatioFrameLayout.addView(surfaceView, 0);
        } else {
            this.f2248n = null;
        }
        this.f2249o = false;
        this.f2250p = B1.K.a == 34 ? new C0034g(5, false) : null;
        this.f2257w = (FrameLayout) findViewById(R.id.exo_ad_overlay);
        this.f2258x = (FrameLayout) findViewById(R.id.exo_overlay);
        this.f2251q = (ImageView) findViewById(R.id.exo_image);
        this.f2237H = 0;
        try {
            cls = ExoPlayer.class;
            method = cls.getMethod("setImageOutput", ImageOutput.class);
            objNewProxyInstance = Proxy.newProxyInstance(ImageOutput.class.getClassLoader(), new Class[]{ImageOutput.class}, new InvocationHandler() { // from class: F2.z
                @Override // java.lang.reflect.InvocationHandler
                public final Object invoke(Object obj, Method method2, Object[] objArr) {
                    E e7 = this.a;
                    e7.getClass();
                    if (!method2.getName().equals("onImageAvailable")) {
                        return null;
                    }
                    e7.f2259y.post(new RunnableC0016c(3, e7, (Bitmap) objArr[1]));
                    return null;
                }
            });
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            cls = null;
            objNewProxyInstance = null;
            method = null;
        }
        this.f2260z = cls;
        this.f2230A = method;
        this.f2231B = objNewProxyInstance;
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_artwork);
        this.f2252r = imageView2;
        this.f2236G = imageView2 != null ? 1 : 0;
        SubtitleView subtitleView = (SubtitleView) findViewById(R.id.exo_subtitles);
        this.f2253s = subtitleView;
        if (subtitleView != null) {
            subtitleView.a();
            subtitleView.b();
        }
        View viewFindViewById = findViewById(R.id.exo_buffering);
        this.f2254t = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(8);
        }
        this.J = 0;
        TextView textView = (TextView) findViewById(R.id.exo_error_message);
        this.f2255u = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        C0163t c0163t = (C0163t) findViewById(R.id.exo_controller);
        View viewFindViewById2 = findViewById(R.id.exo_controller_placeholder);
        if (c0163t != null) {
            this.f2256v = c0163t;
        } else if (viewFindViewById2 != null) {
            C0163t c0163t2 = new C0163t(context);
            this.f2256v = c0163t2;
            c0163t2.setId(R.id.exo_controller);
            c0163t2.setLayoutParams(viewFindViewById2.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById2.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById2);
            viewGroup.removeView(viewFindViewById2);
            viewGroup.addView(c0163t2, iIndexOfChild);
        } else {
            this.f2256v = null;
        }
        C0163t c0163t3 = this.f2256v;
        this.f2240M = c0163t3 != null ? 5000 : 0;
        this.f2243P = true;
        this.f2241N = true;
        this.f2242O = true;
        this.f2233D = c0163t3 != null;
        if (c0163t3 != null) {
            y yVar = c0163t3.f2428k;
            int i7 = yVar.f2492z;
            if (i7 != 3 && i7 != 2) {
                yVar.f();
                yVar.i(2);
            }
            C0163t c0163t4 = this.f2256v;
            A a7 = this.f2245k;
            c0163t4.getClass();
            a7.getClass();
            c0163t4.f2434n.add(a7);
        }
        setClickable(true);
        m();
    }

    public static void a(E e7, Bitmap bitmap) {
        e7.getClass();
        e7.setImage(new BitmapDrawable(e7.getResources(), bitmap));
        if (e7.c()) {
            return;
        }
        ImageView imageView = e7.f2251q;
        if (imageView != null) {
            imageView.setVisibility(0);
            e7.p();
        }
        View view = e7.f2247m;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    private void setImage(Drawable drawable) {
        ImageView imageView = this.f2251q;
        if (imageView == null) {
            return;
        }
        imageView.setImageDrawable(drawable);
        p();
    }

    private void setImageOutput(y1.L l7) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Class cls = this.f2260z;
        if (cls == null || !cls.isAssignableFrom(l7.getClass())) {
            return;
        }
        try {
            Method method = this.f2230A;
            method.getClass();
            Object obj = this.f2231B;
            obj.getClass();
            method.invoke(l7, obj);
        } catch (IllegalAccessException | InvocationTargetException e7) {
            throw new RuntimeException(e7);
        }
    }

    public final boolean b() {
        y1.L l7 = this.f2232C;
        return l7 != null && this.f2231B != null && ((Q4.c) l7).y0(30) && ((H1.G) l7).V0().a(4);
    }

    public final boolean c() {
        y1.L l7 = this.f2232C;
        return l7 != null && ((Q4.c) l7).y0(30) && ((H1.G) l7).V0().a(2);
    }

    public final void d() {
        ImageView imageView = this.f2251q;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
        if (imageView != null) {
            imageView.setImageResource(android.R.color.transparent);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        C0034g c0034g;
        SurfaceSyncGroup surfaceSyncGroup;
        super.dispatchDraw(canvas);
        if (B1.K.a != 34 || (c0034g = this.f2250p) == null || !this.f2244Q || (surfaceSyncGroup = (SurfaceSyncGroup) c0034g.f741l) == null) {
            return;
        }
        surfaceSyncGroup.markSyncReady();
        c0034g.f741l = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        y1.L l7 = this.f2232C;
        if (l7 != null && ((Q4.c) l7).y0(16) && ((H1.G) this.f2232C).c1()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        int keyCode = keyEvent.getKeyCode();
        boolean z7 = keyCode == 19 || keyCode == 270 || keyCode == 22 || keyCode == 271 || keyCode == 20 || keyCode == 269 || keyCode == 21 || keyCode == 268 || keyCode == 23;
        C0163t c0163t = this.f2256v;
        if (z7 && q() && !c0163t.g()) {
            f(true);
            return true;
        }
        if ((q() && c0163t.c(keyEvent)) || super.dispatchKeyEvent(keyEvent)) {
            f(true);
            return true;
        }
        if (z7 && q()) {
            f(true);
        }
        return false;
    }

    public final boolean e() {
        y1.L l7 = this.f2232C;
        return l7 != null && ((Q4.c) l7).y0(16) && ((H1.G) this.f2232C).c1() && ((H1.G) this.f2232C).Y0();
    }

    public final void f(boolean z7) {
        if (!(e() && this.f2242O) && q()) {
            C0163t c0163t = this.f2256v;
            boolean z8 = c0163t.g() && c0163t.getShowTimeoutMs() <= 0;
            boolean zH = h();
            if (z7 || z8 || zH) {
                i(zH);
            }
        }
    }

    public final boolean g(Drawable drawable) {
        ImageView imageView = this.f2252r;
        if (imageView != null && drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                float width = intrinsicWidth / intrinsicHeight;
                ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
                if (this.f2236G == 2) {
                    width = getWidth() / getHeight();
                    scaleType = ImageView.ScaleType.CENTER_CROP;
                }
                AspectRatioFrameLayout aspectRatioFrameLayout = this.f2246l;
                if (aspectRatioFrameLayout != null) {
                    aspectRatioFrameLayout.setAspectRatio(width);
                }
                imageView.setScaleType(scaleType);
                imageView.setImageDrawable(drawable);
                imageView.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    public List<C1055h> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.f2258x;
        if (frameLayout != null) {
            arrayList.add(new C1055h(frameLayout));
        }
        C0163t c0163t = this.f2256v;
        if (c0163t != null) {
            arrayList.add(new C1055h(c0163t));
        }
        return j3.G.s(arrayList);
    }

    public ViewGroup getAdViewGroup() {
        FrameLayout frameLayout = this.f2257w;
        AbstractC0015b.j("exo_ad_overlay must be present for ad playback", frameLayout);
        return frameLayout;
    }

    public int getArtworkDisplayMode() {
        return this.f2236G;
    }

    public boolean getControllerAutoShow() {
        return this.f2241N;
    }

    public boolean getControllerHideOnTouch() {
        return this.f2243P;
    }

    public int getControllerShowTimeoutMs() {
        return this.f2240M;
    }

    public Drawable getDefaultArtwork() {
        return this.I;
    }

    public int getImageDisplayMode() {
        return this.f2237H;
    }

    public FrameLayout getOverlayFrameLayout() {
        return this.f2258x;
    }

    public y1.L getPlayer() {
        return this.f2232C;
    }

    public int getResizeMode() {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f2246l;
        AbstractC0015b.i(aspectRatioFrameLayout);
        return aspectRatioFrameLayout.getResizeMode();
    }

    public SubtitleView getSubtitleView() {
        return this.f2253s;
    }

    @Deprecated
    public boolean getUseArtwork() {
        return this.f2236G != 0;
    }

    public boolean getUseController() {
        return this.f2233D;
    }

    public View getVideoSurfaceView() {
        return this.f2248n;
    }

    public final boolean h() {
        y1.L l7 = this.f2232C;
        if (l7 == null) {
            return true;
        }
        int iZ0 = ((H1.G) l7).Z0();
        if (!this.f2241N) {
            return false;
        }
        if (((Q4.c) this.f2232C).y0(17) && ((H1.G) this.f2232C).U0().p()) {
            return false;
        }
        if (iZ0 != 1 && iZ0 != 4) {
            y1.L l8 = this.f2232C;
            l8.getClass();
            if (((H1.G) l8).Y0()) {
                return false;
            }
        }
        return true;
    }

    public final void i(boolean z7) {
        if (q()) {
            int i7 = z7 ? 0 : this.f2240M;
            C0163t c0163t = this.f2256v;
            c0163t.setShowTimeoutMs(i7);
            y yVar = c0163t.f2428k;
            C0163t c0163t2 = yVar.a;
            if (!c0163t2.h()) {
                c0163t2.setVisibility(0);
                c0163t2.i();
                ImageView imageView = c0163t2.f2455y;
                if (imageView != null) {
                    imageView.requestFocus();
                }
            }
            yVar.k();
        }
    }

    public final void j() {
        if (!q() || this.f2232C == null) {
            return;
        }
        C0163t c0163t = this.f2256v;
        if (!c0163t.g()) {
            f(true);
        } else if (this.f2243P) {
            c0163t.f();
        }
    }

    public final void k() {
        b0 b0Var;
        y1.L l7 = this.f2232C;
        if (l7 != null) {
            H1.G g4 = (H1.G) l7;
            g4.u1();
            b0Var = g4.f3260o0;
        } else {
            b0Var = b0.f18027d;
        }
        int i7 = b0Var.a;
        int i8 = b0Var.f18028b;
        float f5 = this.f2249o ? 0.0f : (i8 == 0 || i7 == 0) ? 0.0f : (i7 * b0Var.f18029c) / i8;
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f2246l;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setAspectRatio(f5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l() {
        /*
            r5 = this;
            android.view.View r0 = r5.f2254t
            if (r0 == 0) goto L2d
            y1.L r1 = r5.f2232C
            r2 = 0
            if (r1 == 0) goto L24
            H1.G r1 = (H1.G) r1
            int r1 = r1.Z0()
            r3 = 2
            if (r1 != r3) goto L24
            int r1 = r5.J
            r4 = 1
            if (r1 == r3) goto L25
            if (r1 != r4) goto L24
            y1.L r1 = r5.f2232C
            H1.G r1 = (H1.G) r1
            boolean r1 = r1.Y0()
            if (r1 == 0) goto L24
            goto L25
        L24:
            r4 = r2
        L25:
            if (r4 == 0) goto L28
            goto L2a
        L28:
            r2 = 8
        L2a:
            r0.setVisibility(r2)
        L2d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: F2.E.l():void");
    }

    public final void m() {
        C0163t c0163t = this.f2256v;
        if (c0163t == null || !this.f2233D) {
            setContentDescription(null);
        } else if (c0163t.g()) {
            setContentDescription(this.f2243P ? getResources().getString(R.string.exo_controls_hide) : null);
        } else {
            setContentDescription(getResources().getString(R.string.exo_controls_show));
        }
    }

    public final void n() {
        TextView textView = this.f2255u;
        if (textView != null) {
            CharSequence charSequence = this.f2239L;
            if (charSequence != null) {
                textView.setText(charSequence);
                textView.setVisibility(0);
                return;
            }
            y1.L l7 = this.f2232C;
            if (l7 != null) {
                H1.G g4 = (H1.G) l7;
                g4.u1();
                C0234o c0234o = g4.f3264q0.f3430f;
            }
            textView.setVisibility(8);
        }
    }

    public final void o(boolean z7) {
        Drawable drawable;
        y1.L l7 = this.f2232C;
        boolean zG = false;
        boolean z8 = (l7 == null || !((Q4.c) l7).y0(30) || ((H1.G) l7).V0().a.isEmpty()) ? false : true;
        boolean z9 = this.f2238K;
        ImageView imageView = this.f2252r;
        View view = this.f2247m;
        if (!z9 && (!z8 || z7)) {
            if (imageView != null) {
                imageView.setImageResource(android.R.color.transparent);
                imageView.setVisibility(4);
            }
            if (view != null) {
                view.setVisibility(0);
            }
            d();
        }
        if (z8) {
            boolean zC = c();
            boolean zB = b();
            if (!zC && !zB) {
                if (view != null) {
                    view.setVisibility(0);
                }
                d();
            }
            ImageView imageView2 = this.f2251q;
            boolean z10 = (view == null || view.getVisibility() != 4 || imageView2 == null || (drawable = imageView2.getDrawable()) == null || drawable.getAlpha() == 0) ? false : true;
            if (zB && !zC && z10) {
                if (view != null) {
                    view.setVisibility(0);
                }
                if (imageView2 != null) {
                    imageView2.setVisibility(0);
                    p();
                }
            } else if (zC && !zB && z10) {
                d();
            }
            if (!zC && !zB && this.f2236G != 0) {
                AbstractC0015b.i(imageView);
                if (l7 != null && ((Q4.c) l7).y0(18)) {
                    H1.G g4 = (H1.G) l7;
                    g4.u1();
                    byte[] bArr = g4.f3240Y.f17909f;
                    if (bArr != null) {
                        zG = g(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
                    }
                }
                if (zG || g(this.I)) {
                    return;
                }
            }
            if (imageView != null) {
                imageView.setImageResource(android.R.color.transparent);
                imageView.setVisibility(4);
            }
        }
    }

    @Override // android.view.View
    public final boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!q() || this.f2232C == null) {
            return false;
        }
        f(true);
        return true;
    }

    public final void p() {
        Drawable drawable;
        AspectRatioFrameLayout aspectRatioFrameLayout;
        ImageView imageView = this.f2251q;
        if (imageView == null || (drawable = imageView.getDrawable()) == null) {
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            return;
        }
        float width = intrinsicWidth / intrinsicHeight;
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
        if (this.f2237H == 1) {
            width = getWidth() / getHeight();
            scaleType = ImageView.ScaleType.CENTER_CROP;
        }
        if (imageView.getVisibility() == 0 && (aspectRatioFrameLayout = this.f2246l) != null) {
            aspectRatioFrameLayout.setAspectRatio(width);
        }
        imageView.setScaleType(scaleType);
    }

    @Override // android.view.View
    public final boolean performClick() {
        j();
        return super.performClick();
    }

    public final boolean q() {
        if (!this.f2233D) {
            return false;
        }
        AbstractC0015b.i(this.f2256v);
        return true;
    }

    public void setArtworkDisplayMode(int i7) {
        AbstractC0015b.h(i7 == 0 || this.f2252r != null);
        if (this.f2236G != i7) {
            this.f2236G = i7;
            o(false);
        }
    }

    public void setAspectRatioListener(InterfaceC0145a interfaceC0145a) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f2246l;
        AbstractC0015b.i(aspectRatioFrameLayout);
        aspectRatioFrameLayout.setAspectRatioListener(interfaceC0145a);
    }

    public void setControllerAnimationEnabled(boolean z7) {
        C0163t c0163t = this.f2256v;
        AbstractC0015b.i(c0163t);
        c0163t.setAnimationEnabled(z7);
    }

    public void setControllerAutoShow(boolean z7) {
        this.f2241N = z7;
    }

    public void setControllerHideDuringAds(boolean z7) {
        this.f2242O = z7;
    }

    public void setControllerHideOnTouch(boolean z7) {
        AbstractC0015b.i(this.f2256v);
        this.f2243P = z7;
        m();
    }

    @Deprecated
    public void setControllerOnFullScreenModeChangedListener(InterfaceC0154j interfaceC0154j) {
        C0163t c0163t = this.f2256v;
        AbstractC0015b.i(c0163t);
        c0163t.setOnFullScreenModeChangedListener(interfaceC0154j);
    }

    public void setControllerShowTimeoutMs(int i7) {
        C0163t c0163t = this.f2256v;
        AbstractC0015b.i(c0163t);
        this.f2240M = i7;
        if (c0163t.g()) {
            i(h());
        }
    }

    public void setControllerVisibilityListener(B b4) {
        this.f2234E = b4;
        if (b4 != null) {
            setControllerVisibilityListener((InterfaceC0162s) null);
        }
    }

    public void setCustomErrorMessage(CharSequence charSequence) {
        AbstractC0015b.h(this.f2255u != null);
        this.f2239L = charSequence;
        n();
    }

    public void setDefaultArtwork(Drawable drawable) {
        if (this.I != drawable) {
            this.I = drawable;
            o(false);
        }
    }

    public void setEnableComposeSurfaceSyncWorkaround(boolean z7) {
        this.f2244Q = z7;
    }

    public void setErrorMessageProvider(InterfaceC2390l interfaceC2390l) {
        if (interfaceC2390l != null) {
            n();
        }
    }

    public void setFullscreenButtonClickListener(C c2) {
        C0163t c0163t = this.f2256v;
        AbstractC0015b.i(c0163t);
        c0163t.setOnFullScreenModeChangedListener(this.f2245k);
    }

    public void setFullscreenButtonState(boolean z7) {
        C0163t c0163t = this.f2256v;
        AbstractC0015b.i(c0163t);
        c0163t.k(z7);
    }

    public void setImageDisplayMode(int i7) {
        AbstractC0015b.h(this.f2251q != null);
        if (this.f2237H != i7) {
            this.f2237H = i7;
            p();
        }
    }

    public void setKeepContentOnPlayerReset(boolean z7) {
        if (this.f2238K != z7) {
            this.f2238K = z7;
            o(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setPlayer(y1.L r12) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 559
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: F2.E.setPlayer(y1.L):void");
    }

    public void setRepeatToggleModes(int i7) {
        C0163t c0163t = this.f2256v;
        AbstractC0015b.i(c0163t);
        c0163t.setRepeatToggleModes(i7);
    }

    public void setResizeMode(int i7) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f2246l;
        AbstractC0015b.i(aspectRatioFrameLayout);
        aspectRatioFrameLayout.setResizeMode(i7);
    }

    public void setShowBuffering(int i7) {
        if (this.J != i7) {
            this.J = i7;
            l();
        }
    }

    public void setShowFastForwardButton(boolean z7) {
        C0163t c0163t = this.f2256v;
        AbstractC0015b.i(c0163t);
        c0163t.setShowFastForwardButton(z7);
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z7) {
        C0163t c0163t = this.f2256v;
        AbstractC0015b.i(c0163t);
        c0163t.setShowMultiWindowTimeBar(z7);
    }

    public void setShowNextButton(boolean z7) {
        C0163t c0163t = this.f2256v;
        AbstractC0015b.i(c0163t);
        c0163t.setShowNextButton(z7);
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z7) {
        C0163t c0163t = this.f2256v;
        AbstractC0015b.i(c0163t);
        c0163t.setShowPlayButtonIfPlaybackIsSuppressed(z7);
    }

    public void setShowPreviousButton(boolean z7) {
        C0163t c0163t = this.f2256v;
        AbstractC0015b.i(c0163t);
        c0163t.setShowPreviousButton(z7);
    }

    public void setShowRewindButton(boolean z7) {
        C0163t c0163t = this.f2256v;
        AbstractC0015b.i(c0163t);
        c0163t.setShowRewindButton(z7);
    }

    public void setShowShuffleButton(boolean z7) {
        C0163t c0163t = this.f2256v;
        AbstractC0015b.i(c0163t);
        c0163t.setShowShuffleButton(z7);
    }

    public void setShowSubtitleButton(boolean z7) {
        C0163t c0163t = this.f2256v;
        AbstractC0015b.i(c0163t);
        c0163t.setShowSubtitleButton(z7);
    }

    public void setShowVrButton(boolean z7) {
        C0163t c0163t = this.f2256v;
        AbstractC0015b.i(c0163t);
        c0163t.setShowVrButton(z7);
    }

    public void setShutterBackgroundColor(int i7) {
        View view = this.f2247m;
        if (view != null) {
            view.setBackgroundColor(i7);
        }
    }

    @Deprecated
    public void setUseArtwork(boolean z7) {
        setArtworkDisplayMode(!z7 ? 1 : 0);
    }

    public void setUseController(boolean z7) {
        boolean z8 = true;
        C0163t c0163t = this.f2256v;
        AbstractC0015b.h((z7 && c0163t == null) ? false : true);
        if (!z7 && !hasOnClickListeners()) {
            z8 = false;
        }
        setClickable(z8);
        if (this.f2233D == z7) {
            return;
        }
        this.f2233D = z7;
        if (q()) {
            c0163t.setPlayer(this.f2232C);
        } else if (c0163t != null) {
            c0163t.f();
            c0163t.setPlayer(null);
        }
        m();
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        View view = this.f2248n;
        if (view instanceof SurfaceView) {
            view.setVisibility(i7);
        }
    }

    @Deprecated
    public void setControllerVisibilityListener(InterfaceC0162s interfaceC0162s) {
        C0163t c0163t = this.f2256v;
        AbstractC0015b.i(c0163t);
        InterfaceC0162s interfaceC0162s2 = this.f2235F;
        if (interfaceC0162s2 == interfaceC0162s) {
            return;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = c0163t.f2434n;
        if (interfaceC0162s2 != null) {
            copyOnWriteArrayList.remove(interfaceC0162s2);
        }
        this.f2235F = interfaceC0162s;
        if (interfaceC0162s != null) {
            copyOnWriteArrayList.add(interfaceC0162s);
            setControllerVisibilityListener((B) null);
        }
    }
}
