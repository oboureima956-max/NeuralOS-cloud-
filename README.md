ht@4"

                extend: {  
                    colors: {  
                        "primary": "#4F46E5", // A modern, vibrant blue  
                        "accent": "#14B8A6", // Teal/Turquoise accent  
                        "background-light": "#f6f6f8",  
                        "background-dark": "#101022",  
                        "card-light": "#ffffff",  
                        "card-dark": "#1a1a33",  
                      : "#1f2937         "text-dark": "#e5e7eb",  
                        "subtle-light": "#6b7280",  
                        "subtle-dark": "#9ca3af",  
                        "border-light": "#e5e7eb",  
                        "border-dark": "#374151",  
                    },  
                    fontFamily: {  
                        "display": ["Lexend", "sans-serif"]  
                    },  
                    borderRadius: {  
                        "DEFAULT": "0.5rem", // Larger default for a softer look  
                        "lg": "0.75rem",  
                        "xl": "1rem",  
                        "full": "9999px"  
                    },  
                },  
            },  
        }  
    </script>  
<style>  
        body {  
            -webkit-font-smoothing: antialiased;  
            -moz-osx-font-smoothing: grayscale;  
        }  
        .material-symbols-outlined {  
            font-variation-settings: 'FILL' 0, 'wght' 400, 'GRAD' 0, 'opsz' 24;  
        }  
    </style>  
<style>  
    body {  
      min-height: max(884px, 100dvh);  
    }  
  </style>  
  </head>  
<body class="bg-background-light dark:bg-background-dark font-display text-text-light dark:text-text-dark">  
<div class="relative flex h-auto min-h-screen w-full flex-col">  
<!-- Top App Bar -->  
<header class="sticky top-0 z-10 flex items-center bg-background-light/80 dark:bg-background-dark/80 p-4 backdrop-blur-sm border-b border-border-light dark:border-border-dark">  
<button class="flex size-10 shrink-0 items-center justify-center rounded-full text-subtle-light dark:text-subtle-dark hover:bg-black/5 dark:hover:bg-white/5">  
<span class="material-symbols-outlined text-2xl">arrow_back</span>  
</button>  
<h1 class="text-lg font-bold leading-tight tracking-tight flex-1 ml-4">Accessibilité &amp; Universalité</h1>  
<div class="flex size-10 shrink-0 items-center justify-center rounded-full text-subtle-light dark:text-subtle-dark">  
<span class="material-symbols-outlined text-2xl">universal_currency_alt</span>  
</div>  
</header>  
<main class="flex-1 pb-24">  
<!-- Segmented Buttons / Tabs -->  
<div class="flex px-4 py-4 sticky top-[73px] z-10 bg-background-light/80 dark:bg-background-dark/80 backdrop-blur-sm">  
<div class="flex h-10 w-full items-center justify-center rounded-xl bg-gray-200 dark:bg-black/20 p-1">  
<label class="flex cursor-pointer h-full grow items-center justify-center overflow-hidden rounded-lg px-2 has-[:checked]:bg-card-light dark:has-[:checked]:bg-card-dark has-[:checked]:shadow-sm text-subtle-light dark:text-subtle-dark has-[:checked]:text-text-light dark:has-[:checked]:text-text-dark text-sm font-medium leading-normal transition-colors duration-200">  
<span class="truncate">Langue</span>  
<input checked="" class="invisible w-0" name="accessibility-tabs" type="radio" value="Langue"/>  
</label>  
<label class="flex cursor-pointer h-full grow items-center justify-center overflow-hidden rounded-lg px-2 has-[:checked]:bg-card-light dark:has-[:checked]:bg-card-dark has-[:checked]:shadow-sm text-subtle-light dark:text-subtle-dark has-[:checked]:text-text-light dark:has-[:checked]:text-text-dark text-sm font-medium leading-normal transition-colors duration-200">  
<span class="truncate">Affichage</span>  
<input class="invisible w-0" name="accessibility-tabs" type="radio" value="Affichage"/>  
</label>  
<label class="flex cursor-pointer h-full grow items-center justify-center overflow-hidden rounded-lg px-2 has-[:checked]:bg-card-light dark:has-[:checked]:bg-card-dark has-[:checked]:shadow-sm text-subtle-light dark:text-subtle-dark has-[:checked]:text-text-light dark:has-[:checked]:text-text-dark text-sm font-medium leading-normal transition-colors duration-200">  
<span class="truncate">Interaction</span>  
<input class="invisible w-0" name="accessibility-tabs" type="radio" value="Interaction"/>  
</label>  
<label class="flex cursor-pointer h-full grow items-center justify-center overflow-hidden rounded-lg px-2 has-[:checked]:bg-card-light dark:has-[:checked]:bg-card-dark has-[:checked]:shadow-sm text-subtle-light dark:text-subtle-dark has-[:checked]:text-text-light dark:has-[:checked]:text-text-dark text-sm font-medium leading-normal transition-colors duration-200">  
<span class="truncate">Cognitif</span>  
<input class="invisible w-0" name="accessibility-tabs" type="radio" value="Cognitif"/>  
</label>  
</div>  
</div>  
<!-- Content Section -->  
<div class="px-4">  
<!-- Langue & Culture Section -->  
<section class="flex flex-col gap-4">  
<h2 class="text-xl font-bold leading-tight tracking-tight pt-4">Langue &amp; Culture</h2>  
<div class="flex flex-col gap-2 rounded-xl bg-card-light dark:bg-card-dark p-4 shadow-sm">  
<label class="flex flex-col">  
<p class="text-base font-medium leading-normal pb-2">Langue de l'interface</p>  
<select class="form-select flex w-full min-w-0 flex-1 resize-none overflow-hidden rounded-lg text-text-light dark:text-text-dark focus:outline-none focus:ring-2 focus:ring-primary border-border-light dark:border-border-dark bg-background-light dark:bg-background-dark placeholder:text-subtle-light dark:placeholder:text-subtle-dark h-12 px-3 text-base font-normal leading-normal appearance-none bg-right-2 bg-no-repeat" style="background-image: url('data:image/svg+xml,%3csvg xmlns=%27http://www.w3.org/2000/svg%27 fill=%27none%27 viewBox=%270 0 20 20%27%3e%3cpath stroke=%27%236b7280%27 stroke-linecap=%27round%27 stroke-linejoin=%27round%27 stroke-width=%271.5%27 d=%27M6 8l4 4 4-4%27/%3e%3c/svg%3e')">  
<option>Français</option>  
<option>English</option>  
<option>Español</option>  
</select>  
</label>  
</div>  
<div class="flex flex-col gap-2 rounded-xl bg-card-light dark:bg-card-dark p-4 shadow-sm">  
<label class="flex flex-col">  
<p class="text-base font-medium leading-normal pb-2">Formats régionaux</p>  
<select class="form-select flex w-full min-w-0 flex-1 resize-none overflow-hidden rounded-lg text-text-light dark:text-text-dark focus:outline-none focus:ring-2 focus:ring-primary border-border-light dark:border-border-dark bg-background-light dark:bg-background-dark placeholder:text-subtle-light dark:placeholder:text-subtle-dark h-12 px-3 text-base font-normal leading-normal appearance-none bg-right-2 bg-no-repeat" style="background-image: url('data:image/svg+xml,%3csvg xmlns=%27http://www.w3.org/2000/svg%27 fill=%27none%27 viewBox=%270 0 20 20%27%3e%3cpath stroke=%27%236b7280%27 stroke-linecap=%27round%27 stroke-linejoin=%27round%27 stroke-width=%271.5%27 d=%27M6 8l4 4 4-4%27/%3e%3c/svg%3e')">  
<option>France (date, unités)</option>  
<option>United States (date, units)</option>  
<option>United Kingdom (date, units)</option>  
</select>  
</label>  
</div>  
</section>  
<!-- This is a placeholder for other sections -->  
<!-- Ideally, content would dynamically change based on the selected tab -->  
<!-- Adaptation Cognitive & Personnalisation de l'IA Section -->  
<section class="flex flex-col gap-4 mt-8">  
<h2 class="text-xl font-bold leading-tight tracking-tight">Adaptation Cognitive</h2>  
<!-- Slider Example -->  
<div class="flex flex-col gap-3 rounded-xl bg-card-light dark:bg-card-dark p-4 shadow-sm">  
<div class="flex items-center justify-between">  
<label class="text-base font-medium leading-normal" for="ai-complexity">Rythme d'Intégration de l'IA</label>  
<span class="text-sm font-medium text-subtle-light dark:text-subtle-dark">Modéré</span>  
</div>  
<input class="w-full h-2 bg-gray-200 dark:bg-gray-700 rounded-lg appearance-none cursor-pointer accent-accent" id="ai-complexity" max="100" min="0" type="range" value="50"/>  
</div>  
<!-- Toggle Switches Example -->  
<div class="flex flex-col gap-2 rounded-xl bg-card-light dark:bg-card-dark divide-y divide-border-light dark:divide-border-dark shadow-sm">  
<label class="flex items-center justify-between p-4 cursor-pointer">  
<div>  
<p class="text-base font-medium leading-normal">Mode Contraste Élevé</p>  
<p class="text-sm text-subtle-light dark:text-subtle-dark">Augmente la lisibilité du texte.</p>  
</div>  
<div class="relative inline-flex items-center">  
<input class="sr-only peer" type="checkbox"/>  
<div class="w-11 h-6 bg-gray-200 dark:bg-gray-700 rounded-full peer peer-checked:after:translate-x-full peer-checked:after:border-white after:content-[''] after:absolute after:top-0.5 after:left-[2px] after:bg-white after:border-gray-300 after:border after:rounded-full after:h-5 after:w-5 after:transition-all peer-checked:bg-accent"></div>  
</div>  
</label>  
<label class="flex items-center justify-between p-4 cursor-pointer">  
<div>  
<p class="text-base font-medium leading-normal">Descriptions Audio</p>  
<p class="text-sm text-subtle-light dark:text-subtle-dark">Active la narration pour les images.</p>  
</div>  
<div class="relative inline-flex items-center">  
<input checked="" class="sr-only peer" type="checkbox"/>  
<div class="w-11 h-6 bg-gray-200 dark:bg-gray-700 rounded-full peer peer-checked:after:translate-x-full peer-checked:after:border-white after:content-[''] after:absolute after:top-0.5 after:left-[2px] after:bg-white after:border-gray-300 after:border after:rounded-full after:h-5 after:w-5 after:transition-all peer-checked:bg-accent"></div>  
</div>  
</label>  
</div>  
<!-- Information section -->  
<div class="flex items-start gap-3 rounded-xl bg-primary/10 dark:bg-primary/20 p-4 text-primary dark:text-indigo-300">  
<span class="material-symbols-outlined mt-0.5 text-xl">info</span>  
<p class="text-sm">Nos principes d'inclusivité de l'IA garantissent la protection de la diversité neurocognitive pour une expérience équitable et personnalisée.</p>  
</div>  
</section>  
<div class="mt-8 flex justify-center">  
<button class="w-full max-w-xs h-12 px-6 bg-gray-200 dark:bg-card-dark text-text-light dark:text-text-dark text-base font-semibold rounded-xl hover:bg-gray-300 dark:hover:bg-opacity-80 transition-colors">  
                        Réinitialiser aux paramètres par défaut  
                     </button>  
</div>  
</div>  
</main>  
</div>  
</body></html><!DOCTYPE html>  <html class="dark" lang="fr"><head>  
<meta charset="utf-8"/>  
<meta content="width=device-width, initial-scale=1.0" name="viewport"/>  
<title>Évolution vers Homo Technolocus</title>  
<script src="https://cdn.tailwindcss.com?plugins=forms,container-queries"></script>  
<link href="https://fonts.googleapis.com/css2?family=Space+Grotesk:wght@400;500;700&amp;display=swap" rel="stylesheet"/>  
<link href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined" rel="stylesheet"/>  
<script>  
    tailwind.config = {  
      darkMode: "class",  
      theme: {  
        extend: {  
          colors: {  
            "primary": "#1313ec",  
            "background-light": "#f6f6f8",  
            "background-dark": "#101022",  
          },  
          fontFamily: {  
            "display": ["Space Grotesk", "sans-serif"]  
          },  
          borderRadius: {  
            "DEFAULT": "0.25rem",  
            "lg": "0.5rem",  
            "xl": "0.75rem",  
            "full": "9999px"  
          },  
        },  
      },  
    }  
  </script>  
<style>  
    .material-symbols-outlined {  
      font-variation-settings:  
        'FILL' 0,  
        'wght' 400,  
        'GRAD' 0,  
        'opsz' 24  
    }  
  </style>  
<style>  
    body {  
      min-height: max(884px, 100dvh);  
    }  
  </style>  
<style>  
    body {  
      min-height: max(884px, 100dvh);  
    }  
  </style>  
  </head>  
<body class="bg-background-light dark:bg-background-dark font-display">  
<div class="relative flex h-auto min-h-screen w-full flex-col bg-background-light dark:bg-background-dark overflow-x-hidden">  
<div class="flex items-center bg-background-light dark:bg-background-dark p-4 pb-2 justify-between sticky top-0 z-10">  
<div class="flex size-12 shrink-0 items-center justify-start">  
<span class="material-symbols-outlined text-gray-800 dark:text-white" style="font-size: 24px;">arrow_back</span>  
</div>  
<h1 class="text-gray-900 dark:text-white text-lg font-bold leading-tight tracking-[-0.015em] flex-1 text-center">Évolution vers Homo Technolocus</h1>  
<div class="flex w-12 items-center justify-end">  
<button class="flex max-w-[480px] cursor-pointer items-center justify-center overflow-hidden rounded-lg h-12 bg-transparent text-gray-800 dark:text-white gap-2 text-base font-bold leading-normal tracking-[0.015em] min-w-0 p-0">  
<span class="material-symbols-outlined" style="font-size: 24px;">settings</span>  
</button>  
</div>  
</div>  
<main class="flex-1 px-4">  
<h2 class="text-gray-900 dark:text-white text-lg font-bold leading-tight tracking-[-0.015em] pt-4 pb-2">Contrôles Granulaires de la Vitesse d'Intégration</h2>  
<div class="flex flex-col gap-4 p-4 bg-gray-100 dark:bg-black/20 rounded-xl">  
<div class="flex items-center gap-4">  
<span class="material-symbols-outlined text-primary">speed</span>  
<p class="text-gray-800 dark:text-white text-base font-medium leading-normal flex-1">Rythme d'adaptation de l'IA</p>  
</div>  
<div class="flex flex-col gap-2">  
<input class="w-full h-2 bg-gray-300 dark:bg-gray-700/50 rounded-lg appearance-none cursor-pointer range-lg accent-primary" id="integration-speed" max="100" min="0" type="range" value="42"/>  
<div class="flex justify-between text-xs text-gray-500 dark:text-gray-400">  
<span>Prudent</span>  
<span>Équilibré</span>  
<span>Accéléré</span>  
</div>  
</div>  
<p class="text-gray-500 dark:text-gray-400 text-sm font-normal leading-normal">Ajustez la vitesse à laquelle l'IA s'intègre et propose des optimisations. Votre confort est la priorité.</p>  
</div>  
<h2 class="text-gray-900 dark:text-white text-lg font-bold leading-tight tracking-[-0.015em] pt-8 pb-2">Zones de Sécurité Cognitives</h2>  
<div class="flex flex-col gap-4">  
<div class="flex items-center gap-4 bg-gray-100 dark:bg-black/20 p-4 rounded-xl cursor-pointer">  
<div class="text-primary flex items-center justify-center rounded-lg bg-primary/20 shrink-0 size-12">  
<span class="material-symbols-outlined">psychology_alt</span>  
</div>  
<div class="flex-1">  
<p class="text-gray-900 dark:text-white text-base font-medium leading-normal">Noyau Identitaire</p>  
<p class="text-gray-500 dark:text-gray-400 text-sm">Définir les souvenirs et valeurs fondamentaux à préserver.</p>  
</div>  
<span class="material-symbols-outlined text-gray-500 dark:text-gray-400">chevron_right</span>  
</div>  
<div class="flex items-center gap-4 bg-gray-100 dark:bg-black/20 p-4 rounded-xl cursor-pointer">  
<div class="text-primary flex items-center justify-center rounded-lg bg-primary/20 shrink-0 size-12">  
<span class="material-symbols-outlined">palette</span>  
</div>  
<div class="flex-1">  
<p class="text-gray-900 dark:text-white text-base font-medium leading-normal">Créativité &amp; Intuition</p>  
<p class="text-gray-500 dark:text-gray-400 text-sm">Protéger les processus de pensée non-linéaire.</p>  
</div>  
<span class="material-symbols-outlined text-gray-500 dark:text-gray-400">chevron_right</span>  
</div>  
</div>  
<h2 class="text-gray-900 dark:text-white text-lg font-bold leading-tight tracking-[-0.015em] pt-8 pb-2">Feedbacks Clairs sur l'Impact</h2>  
<div class="relative flex flex-col gap-4 bg-gradient-to-br from-primary/10 to-transparent dark:from-primary/20 dark:to-transparent p-4 rounded-xl border border-primary/20">  
<div class="absolute top-4 right-4 flex items-center gap-1 text-primary text-xs font-medium">  
<span class="material-symbols-outlined text-sm">insights</span>  
<span>ANALYSE EN COURS</span>  
</div>  
<div class="flex items-start gap-4">  
<div class="text-primary flex items-center justify-center rounded-lg bg-primary/20 shrink-0 size-10 mt-1">  
<span class="material-symbols-outlined">person</span>  
</div>  
<div>  
<p class="text-gray-900 dark:text-white text-base font-medium leading-normal">Renforcement Individuel</p>  
<p class="text-gray-500 dark:text-gray-400 text-sm">L'IA augmente vos capacités sans altérer votre personnalité.</p>  
</div>  
</div>  
<div class="flex items-start gap-4">  
<div class="text-primary flex items-center justify-center rounded-lg bg-primary/20 shrink-0 size-10 mt-1">  
<span class="material-symbols-outlined">hub</span>  
</div>  
<div>  
<p class="text-gray-900 dark:text-white text-base font-medium leading-normal">Symbiose vs. Fusion</p>  
<p class="text-gray-500 dark:text-gray-400 text-sm">Collaboration homme-IA à 98% symbiotique. Contrôle maintenu.</p>  
</div>  
</div>  
</div>  
<div class="h-24"></div>  
</main>  
<div class="fixed bottom-0 left-0 right-0 bg-background-light/80 dark:bg-background-dark/80 backdrop-blur-lg border-t border-gray-200 dark:border-white/10">  
<div class="flex justify-around items-center h-20 px-4">  
<a class="flex flex-col items-center gap-1 text-gray-500 dark:text-gray-400" href="#">  
<span class="material-symbols-outlined">dashboard</span>  
<span class="text-xs">Dashboard</span>  
</a>  
<a class="flex flex-col items-center gap-1 text-primary" href="#">  
<span class="material-symbols-outlined" style="font-variation-settings: 'FILL' 1;">neurology</span>  
<span class="text-xs font-bold">Évolution</span>  
</a>  
<a class="flex flex-col items-center gap-1 text-gray-500 dark:text-gray-400" href="#">  
<span class="material-symbols-outlined">monitoring</span>  
<span class="text-xs">Visualisation</span>  
</a>  
<a class="flex flex-col items-center gap-1 text-gray-500 dark:text-gray-400" href="#">  
<span class="material-symbols-outlined">account_circle</span>  
<span class="text-xs">Profil</span>  
</a>  
</div>  
</div>  
</div>  </body></html><!DOCTYPE html>  <html class="dark" lang="fr"><head>  
<meta charset="utf-8"/>  
<meta content="width=device-width, initial-scale=1.0" name="viewport"/>  
<title>Neural Link V1.0</title>  
<script src="https://cdn.tailwindcss.com?plugins=forms,container-queries"></script>  
<link href="https://fonts.googleapis.com/css2?family=Space+Grotesk:wght@300..700&amp;display=swap" rel="stylesheet"/>  
<link href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined" rel="stylesheet"/>  
<script>  
        tailwind.config = {  
            darkMode: "class",  
            theme: {  
                extend: {  
                    colors: {  
                        "primary": "#00BFFF",  
                        "background-light": "#f6f6f8",  
                        "background-dark": "#121212",  
                    },  
                    fontFamily: {  
                        "display": ["Space Grotesk", "sans-serif"]  
                    },  
                    borderRadius: {  
                        "DEFAULT": "0.25rem",  
                        "lg": "0.5rem",  
                        "xl": "0.75rem",  
                        "full": "9999px"  
                    },  
                    animation: {  
                        pulse: 'pulse 3s cubic-bezier(0.4, 0, 0.6, 1) infinite',  
                        'graph-pulse': 'graph-pulse 2s cubic-bezier(0.4, 0, 0.6, 1) infinite',  
                    },  
                    keyframes: {  
                        pulse: {  
                            '0%, 100%': {  
                                opacity: 1,  
                                transform: 'scale(1)'  
                            },  
                            '50%': {  
                                opacity: 0.7,  
                                transform: 'scale(1.05)'  
                            },  
                        },  
                        'graph-pulse': {  
                          '0%, 100%': { opacity: '0.4' },  
                          '50%': { opacity: '1' }  
                        }  
                    },  
                },  
            },  
        }  
    </script>  
<style>  
        body {  
            min-height: max(884px, 100dvh);  
        }  
    </style>  
<style>  
    body {  
      min-height: max(884px, 100dvh);  
    }  
  </style>  
  </head>  
<body class="bg-background-light dark:bg-background-dark font-display text-[#E0E0E0]">  
<div class="relative flex h-auto min-h-screen w-full flex-col group/design-root overflow-x-hidden">  
<div class="flex items-center p-4">  
<button class="flex size-10 shrink-0 items-center justify-center rounded-full text-[#E0E0E0] transition-colors hover:bg-white/10">  
<span class="material-symbols-outlined text-2xl">arrow_back</span>  
</button>  
<h2 class="flex-1 text-center text-xl font-bold leading-tight tracking-tight text-[#E0E0E0]">Connexion Neurale IA Avancée</h2>  
<button class="flex size-10 shrink-0 items-center justify-center rounded-full text-[#E0E0E0] transition-colors hover:bg-white/10">  
<span class="material-symbols-outlined text-2xl">menu</span>  
</button>  
</div>  
<main class="flex-grow flex flex-col items-center px-4 pt-4 pb-6">  
<div class="w-full max-w-sm">  
<h3 class="mb-3 text-lg font-semibold text-white/90">Visualisation des Ondes Cérébrales</h3>  
<div class="rounded-xl border border-white/20 bg-white/5 p-4">  
<div class="flex h-40 flex-col justify-between">  
<div class="relative h-full w-full">  
<div class="absolute inset-0 grid grid-rows-4">  
<div class="border-t border-dashed border-white/10"></div>  
<div class="border-t border-dashed border-white/10"></div>  
<div class="border-t border-dashed border-white/10"></div>  
<div class="border-t border-dashed border-white/10"></div>  
</div>  
<svg class="absolute inset-0 h-full w-full overflow-visible" fill="none" viewBox="0 0 300 160">  
<path class="animate-[graph-pulse_2.5s_infinite_-0.2s]" d="M0 80 Q 25 40, 50 80 T 100 80 T 150 80 Q 175 120, 200 80 T 250 80 T 300 80" stroke="#FF5733" stroke-width="2"></path>  
<path class="animate-[graph-pulse_2s_infinite_-0.4s]" d="M0 80 Q 15 110, 30 80 T 60 80 Q 75 50, 90 80 T 120 80 Q 135 110, 150 80 T 180 80 Q 195 50, 210 80 T 240 80 Q 255 110, 270 80 T 300 80" stroke="#C70039" stroke-width="2"></path>  
<path class="animate-[graph-pulse_3s_infinite_-0.6s]" d="M0 80 C 40 20, 60 140, 100 80 S 140 20, 180 80 S 220 140, 260 80 S 300 80, 300 80" stroke="#900C3F" stroke-width="2"></path>  
<path class="animate-[graph-pulse_1.5s_infinite_-0.8s]" d="M0 80 L 20 60 L 40 100 L 60 70 L 80 90 L 100 80 L 120 60 L 140 100 L 160 70 L 180 90 L 200 80 L 220 60 L 240 100 L 260 70 L 280 90 L 300 80" stroke="#581845" stroke-width="2"></path>  
<path class="animate-[graph-pulse_3.5s_infinite_-1s]" d="M0 80 C 50 150, 100 10, 150 80 S 200 150, 250 10, 300 80" stroke="#00BFFF" stroke-width="2.5"></path>  
</svg>  
</div>  
</div>  
<div class="mt-3 flex flex-wrap justify-center gap-x-4 gap-y-1 text-xs">  
<div class="flex items-center gap-1.5"><div class="h-2 w-2 rounded-full" style="background-color: #00BFFF;"></div><span>Gamma</span></div>  
<div class="flex items-center gap-1.5"><div class="h-2 w-2 rounded-full" style="background-color: #FF5733;"></div><span>Beta</span></div>  
<div class="flex items-center gap-1.5"><div class="h-2 w-2 rounded-full" style="background-color: #C70039;"></div><span>Alpha</span></div>  
<div class="flex items-center gap-1.5"><div class="h-2 w-2 rounded-full" style="background-color: #900C3F;"></div><span>Theta</span></div>  
<div class="flex items-center gap-1.5"><div class="h-2 w-2 rounded-full" style="background-color: #581845;"></div><span>Delta</span></div>  
</div>  
</div>  
</div>  
<div class="mt-6 flex w-full max-w-sm flex-col items-center">  
<div class="flex items-center gap-2 rounded-full border border-white/20 bg-white/5 px-4 py-1.5">  
<div class="h-2 w-2 animate-pulse rounded-full bg-[#39FF14] shadow-[0_0_8px_0_#39FF14]"></div>  
<p class="text-sm font-medium text-white/90">Qualité du Signal: <span class="font-bold text-[#39FF14]">Excellent (98%)</span></p>  
</div>  
</div>  
<div class="mt-8 w-full max-w-sm">  
<h3 class="mb-3 text-lg font-semibold text-white/90">Modes de Focalisation Cérébrale</h3>  
<div class="grid grid-cols-1 gap-3 sm:grid-cols-2">  
<button class="flex items-center justify-between gap-3 rounded-lg border border-primary bg-primary/10 p-3 text-left transition-all hover:bg-primary/20">  
<div>  
<p class="font-semibold text-white">Focus Profond</p>  
<p class="text-xs text-white/60">Concentration maximale.</p>  
</div>  
<span class="material-symbols-outlined text-primary">check_circle</span>  
</button>  
<button class="flex items-center justify-between gap-3 rounded-lg border border-white/20 bg-white/5 p-3 text-left transition-all hover:bg-white/10">  
<div>  
<p class="font-medium text-white/80">Créativité Augmentée</p>  
<p class="text-xs text-white/60">Stimule l'inspiration.</p>  
</div>  
</button>  
<button class="flex items-center justify-between gap-3 rounded-lg border border-white/20 bg-white/5 p-3 text-left transition-all hover:bg-white/10">  
<div>  
<p class="font-medium text-white/80">Apprentissage Accéléré</p>  
<p class="text-xs text-white/60">Optimise l'assimilation.</p>  
</div>  
</button>  
<button class="flex items-center justify-between gap-3 rounded-lg border border-white/20 bg-white/5 p-3 text-left transition-all hover:bg-white/10">  
<div>  
<p class="font-medium text-white/80">Relaxation Guidée</p>  
<p class="text-xs text-white/60">Calme et sérénité.</p>  
</div>  
</button>  
</div>  
</div>  
<div class="mt-8 w-full max-w-sm">  
<details class="group">  
<summary class="list-none flex cursor-pointer items-center justify-between rounded-md p-2 transition-colors hover:bg-white/10">  
<h3 class="text-lg font-semibold text-white/90">Calibration IA par Ondes</h3>  
<span class="material-symbols-outlined transition-transform duration-300 group-open:rotate-180">expand_more</span>  
</summary>  
<div class="mt-4 space-y-4 border-l border-white/20 pl-4 text-sm text-white/70">  
<div class="flex items-center justify-between">  
<label class="text-white/90" for="intention-sensitivity">Sensibilité d'Intention</label>  
<span class="text-primary font-medium">85%</span>  
</div>  
<input class="h-1.5 w-full cursor-pointer appearance-none rounded-full bg-white/20 accent-primary" id="intention-sensitivity" max="100" min="0" type="range" value="85"/>  
<div class="flex items-center justify-between">  
<label class="text-white/90" for="feedback-loop">Boucle de Rétroaction Neuronale</label>  
<div class="relative inline-flex h-6 w-11 cursor-pointer items-center rounded-full">  
<input checked="" class="peer sr-only" id="feedback-loop" type="checkbox"/>  
<span class="h-full w-full rounded-full bg-white/20 peer-checked:bg-primary"></span>  
<span class="absolute left-1 top-1 h-4 w-4 rounded-full bg-white transition-all peer-checked:left-6"></span>  
</div>  
</div>  
<button class="w-full rounded-lg bg-primary/20 py-2.5 px-4 font-semibold text-primary transition-colors hover:bg-primary/30">Lancer la recalibration</button>  
</div>  
</details>  
</div>  
<div class="my-8 w-full max-w-sm">  
<button class="w-full rounded-lg bg-[#FF073A] py-4 px-6 font-bold text-black shadow-lg shadow-red-500/20 transition-colors hover:bg-red-700">Déconnexion Neurale</button>  
</div>  
</main>  
</div>  </body></html><!DOCTYPE html>  <html class="dark" lang="fr"><head>  
<meta charset="utf-8"/>  
<meta content="width=device-width, initial-scale=1.0" name="viewport"/>  
<title>Gestion Sensorielle IA</title>  
<script src="https://cdn.tailwindcss.com?plugins=forms,container-queries"></script>  
<link href="https://fonts.googleapis.com/css2?family=Space+Grotesk:wght@400;500;700&amp;display=swap" rel="stylesheet"/>  
<link href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined" rel="stylesheet"/>  
<script>  
        tailwind.config = {  
            darkMode: "class",  
            theme: {  
                extend: {  
                    colors: {  
                        "primary": "#00f5d4", // Cyan électrique  
                        "background-light": "#f6f6f8",  
                        "background-dark": "#0d1117", // Gris anthracite/bleu nuit  
                        "card-dark": "#161b22",  
                        "accent-red": "#ff4d4d",  
                    },  
                    fontFamily: {  
                        "display": ["Space Grotesk", "sans-serif"]  
                    },  
                    borderRadius: {  
                        "DEFAULT": "0.5rem",  
                        "lg": "0.75rem",  
                        "xl": "1rem",  
                        "full": "9999px",  
                    },  
                },  
            },  
        }  
    </script>  
<style>  
        .material-symbols-outlined {  
            font-variation-settings: 'FILL' 0, 'wght' 300, 'GRAD' 0, 'opsz' 24;  
            font-size: 24px;  
        }  
    </style>  
<style>  
    body {  
      min-height: max(884px, 100dvh);  
    }  
  </style>  
  </head>  
<body class="bg-background-dark font-display">  
<div class="relative flex h-auto min-h-screen w-full flex-col bg-background-dark dark group/design-root overflow-x-hidden">  
<!-- Top App Bar -->  
<div class="flex items-center bg-background-dark p-4 pb-2 justify-between sticky top-0 z-10 border-b border-white/10">  
<div class="flex size-12 shrink-0 items-center justify-start text-primary">  
<span class="material-symbols-outlined text-3xl">neurology</span>  
</div>  
<h1 class="text-white text-lg font-bold leading-tight tracking-[-0.015em] flex-1 text-center">Gestion Sensorielle IA</h1>  
<div class="flex w-12 items-center justify-end">  
<button class="flex max-w-[480px] cursor-pointer items-center justify-center overflow-hidden rounded-full h-10 w-10 bg-transparent text-white/80 gap-2 text-base font-bold leading-normal tracking-[0.015em] min-w-0 p-0 hover:bg-white/10 transition-colors">  
<span class="material-symbols-outlined">signal_cellular_alt</span>  
</button>  
</div>  
</div>  
<main class="p-4 flex flex-col gap-6">  
<!-- Panneau de Contrôle -->  
<div class="flex flex-col gap-4 rounded-xl bg-card-dark p-4 @container">  
<p class="text-white text-lg font-bold leading-tight tracking-[-0.015em]">Panneau de Contrôle</p>  
<p class="text-white/60 text-base font-normal leading-normal -mt-2">Activez et ajustez vos augmentations sensorielles.</p>  
<!-- Toggles -->  
<div class="flex flex-col gap-3">  
<div class="flex items-center gap-4 min-h-14 justify-between">  
<div class="flex items-center gap-4">  
<div class="text-primary flex items-center justify-center rounded-lg bg-primary/20 shrink-0 size-10">  
<span class="material-symbols-outlined">visibility</span>  
</div>  
<p class="text-white text-base font-normal leading-normal flex-1 truncate">Augmentation Visuelle</p>  
</div>  
<div class="shrink-0">  
<label class="relative flex h-[31px] w-[51px] cursor-pointer items-center rounded-full border-none bg-white/10 p-0.5 has-[:checked]:justify-end has-[:checked]:bg-primary">  
<div class="h-full w-[27px] rounded-full bg-background-dark" style="box-shadow: rgba(0, 0, 0, 0.15) 0px 3px 8px, rgba(0, 0, 0, 0.06) 0px 3px 1px;"></div>  
<input checked="" class="invisible absolute" type="checkbox"/>  
</label>  
</div>  
</div>  
<div class="flex items-center gap-4 min-h-14 justify-between">  
<div class="flex items-center gap-4">  
<div class="text-primary flex items-center justify-center rounded-lg bg-primary/20 shrink-0 size-10">  
<span class="material-symbols-outlined">hearing</span>  
</div>  
<p class="text-white text-base font-normal leading-normal flex-1 truncate">Augmentation Auditive</p>  
</div>  
<div class="shrink-0">  
<label class="relative flex h-[31px] w-[51px] cursor-pointer items-center rounded-full border-none bg-white/10 p-0.5 has-[:checked]:justify-end has-[:checked]:bg-primary">  
<div class="h-full w-[27px] rounded-full bg-background-dark" style="box-shadow: rgba(0, 0, 0, 0.15) 0px 3px 8px, rgba(0, 0, 0, 0.06) 0px 3px 1px;"></div>  
<input class="invisible absolute" type="checkbox"/>  
</label>  
</div>  
</div>  
</div>  
<!-- Sliders -->  
<div class="border-t border-white/10 pt-4 mt-2 flex flex-col gap-4 @container">  
<div class="relative flex w-full flex-col items-start justify-between gap-3 @[480px]:flex-row @[480px]:items-center">  
<div class="flex w-full shrink-[3] items-center justify-between">  
<p class="text-white text-base font-medium leading-normal">Intensité Vision Thermique</p>  
<p class="text-white/80 text-sm font-normal leading-normal @[480px]:hidden">65%</p>  
</div>  
<div class="flex h-4 w-full items-center gap-4">  
<div class="flex h-1.5 flex-1 rounded-full bg-white/20">  
<div class="h-full rounded-full bg-primary" style="width: 65%;"></div>  
<div class="relative"><div class="absolute -left-2.5 -top-[7px] size-5 rounded-full bg-white border-2 border-primary"></div></div>  
</div>  
<p class="text-white/80 text-sm font-normal leading-normal hidden @[480px]:block">65%</p>  
</div>  
</div>  
<div class="relative flex w-full flex-col items-start justify-between gap-3 @[480px]:flex-row @[480px]:items-center">  
<div class="flex w-full shrink-[3] items-center justify-between">  
<p class="text-white/50 text-base font-medium leading-normal">Niveau Filtrage Sonore</p>  
<p class="text-white/50 text-sm font-normal leading-normal @[480px]:hidden">0%</p>  
</div>  
<div class="flex h-4 w-full items-center gap-4 opacity-50">  
<div class="flex h-1.5 flex-1 rounded-full bg-white/20">  
<div class="h-full w-[0%] rounded-full bg-primary"></div>  
<div class="relative"><div class="absolute -left-2.5 -top-[7px] size-5 rounded-full bg-white border-2 border-primary"></div></div>  
</div>  
<p class="text-white/80 text-sm font-normal leading-normal hidden @[480px]:block">0%</p>  
</div>  
</div>  
</div>  
<!-- Select -->  
<div class="border-t border-white/10 pt-4 mt-2">  
<label class="block text-white text-base font-medium mb-2" for="vision-mode">Mode Visuel</label>  
<div class="relative">  
<select class="w-full appearance-none rounded-lg bg-white/10 border-none text-white p-3 pr-8 focus:ring-2 focus:ring-primary" id="vision-mode">  
<option>Normal</option>  
<option selected="">Vision Thermique</option>  
<option>Vision Nocturne</option>  
</select>  
<span class="material-symbols-outlined absolute right-2 top-1/2 -translate-y-1/2 text-white/50 pointer-events-none">expand_more</span>  
</div>  
</div>  
</div>  
<!-- Visualisation des Flux -->  
<div class="flex flex-col gap-4 rounded-xl bg-card-dark p-4 @container">  
<p class="text-white text-lg font-bold leading-tight tracking-[-0.015em]">Flux Sensoriels en Temps Réel</p>  
<div class="w-full h-40 bg-center bg-no-repeat aspect-video bg-cover rounded-lg flex items-center justify-center" data-alt="Visualisation de données abstraites représentant des ondes sonores et visuelles traitées par l'IA, avec des tons cyan et bleu foncé." style="background-image: url('https://lh3.googleusercontent.com/aida-public/AB6AXuCl1em79HFfa0GXQISuvz9DDKWZu6wOKfPnKQcNRrgo3CImBd1Yy3iO5JuVZv-LvJdGBz9z8R8jY1EmaeYp0_NaCSwmtR1YCH9uB3PqFTvDhGNx4jvAMLF-1mCfjSFQDrjpmLPlXSZLbpDFAdWnqWvWQIq3FxlKzdCoBoCee8Caczos_bnA-QhXktpTECh2CDPmFTe8CyIhjSxpDicaAJjpZAkQ6CiRKIjmAy4tbTXHx0konlY7V-XTiY5NZ_FP1vtZ-nb3qd1rswhQ');">  
<div class="flex items-center gap-2 bg-black/30 backdrop-blur-sm p-2 px-3 rounded-full">  
<div class="size-2 rounded-full bg-primary animate-pulse"></div>  
<p class="text-white/90 text-sm">IA active: 3 objets identifiés</p>  
</div>  
</div>  
</div>  
<!-- Personnalisation & Zones -->  
<div class="grid grid-cols-1 md:grid-cols-2 gap-4">  
<!-- Paramètres de Perception -->  
<div class="flex flex-col gap-4 rounded-xl bg-card-dark p-4 @container">  
<p class="text-white text-lg font-bold leading-tight tracking-[-0.015em]">Personnalisation Neuronale</p>  
<div class="flex flex-col gap-3">  
<button class="w-full text-left p-3 rounded-lg bg-primary/20 text-white/90 hover:bg-primary/30 transition-colors flex justify-between items-center">  
                            Profil Urbain <span class="material-symbols-outlined text-white/50">drive_file_rename_outline</span>  
</button>  
<button class="w-full text-left p-3 rounded-lg bg-white/10 text-white/90 hover:bg-white/20 transition-colors flex justify-between items-center">  
                            Charger un profil <span class="material-symbols-outlined text-white/50">upload</span>  
</button>  
</div>  
</div>  
<!-- Zones d'Intérêt -->  
<div class="flex flex-col gap-4 rounded-xl bg-card-dark p-4 @container items-center justify-center">  
<p class="text-white text-lg font-bold leading-tight tracking-[-0.015em]">Zones de Focus IA</p>  
<div class="w-24 h-24 rounded-lg bg-white/10 flex items-center justify-center">  
<span class="material-symbols-outlined text-primary text-5xl">filter_center_focus</span>  
</div>  
<button class="w-full text-center p-3 mt-2 rounded-lg bg-white/10 text-white/90 hover:bg-white/20 transition-colors">Définir Zone</button>  
</div>  
</div>  
<!-- Éthique et Contrôle -->  
<div class="flex flex-col gap-4 rounded-xl bg-card-dark p-4 @container mt-2">  
<p class="text-white text-lg font-bold leading-tight tracking-[-0.015em]">Contrôle Éthique</p>  
<div class="flex flex-col sm:flex-row gap-3">  
<button class="flex-1 flex items-center justify-center gap-2 p-3 rounded-lg bg-white/10 text-white/80 hover:bg-white/20 transition-colors">  
<span class="material-symbols-outlined">gavel</span> Charte Éthique  
                    </button>  
<button class="flex-1 flex items-center justify-center gap-2 p-3 rounded-lg bg-accent-red/80 text-white font-bold hover:bg-accent-red transition-colors">  
<span class="material-symbols-outlined">power_settings_new</span> Kill Switch  
                    </button>  
</div>  
</div>  
</main>  
<div class="h-10"></div> <!-- Spacer at bottom -->  
</div>  
</body></html><!DOCTYPE html>  <html class="dark" lang="fr"><head>  
<meta charset="utf-8"/>  
<meta content="width=device-width, initial-scale=1.0" name="viewport"/>  
<title>Évolution Neurale &amp; Autonomie IA</title>  
<script src="https://cdn.tailwindcss.com?plugins=forms,container-queries"></script>  
<link href="https://fonts.googleapis.com/css2?family=Space+Grotesk:wght@400;500;700&amp;display=swap" rel="stylesheet"/>  
<link href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined" rel="stylesheet"/>  
<script>  
    tailwind.config = {  
      darkMode: "class",  
      theme: {  
        extend: {  
          colors: {  
            "primary": "#1313ec",  
            "background-light": "#f6f6f8",  
            "background-dark": "#101022",  
          },  
          fontFamily: {  
            "display": ["Space Grotesk", "sans-serif"]  
          },  
          borderRadius: {  
            "DEFAULT": "0.25rem",  
            "lg": "0.5rem",  
            "xl": "0.75rem",  
            "full": "9999px"  
          },  
        },  
      },  
    }  
  </script>  
<style>  
    .material-symbols-outlined {  
      font-variation-settings:  
        'FILL' 0,  
        'wght' 400,  
        'GRAD' 0,  
        'opsz' 24  
    }  
  </style>  
<style>  
    body {  
      min-height: max(884px, 100dvh);  
    }  
  </style>  
<style>  
    body {  
      min-height: max(884px, 100dvh);  
    }  
  </style>  
  </head>  
<body class="bg-background-light dark:bg-background-dark font-display">  
<div class="relative flex h-auto min-h-screen w-full flex-col bg-background-light dark:bg-background-dark overflow-x-hidden">  
<div class="flex items-center bg-background-light dark:bg-background-dark p-4 pb-2 justify-between sticky top-0 z-10">  
<div class="flex size-12 shrink-0 items-center justify-start">  
<span class="material-symbols-outlined text-gray-800 dark:text-white" style="font-size: 24px;">arrow_back</span>  
</div>  
<h1 class="text-gray-900 dark:text-white text-lg font-bold leading-tight tracking-[-0.015em] flex-1 text-center">Évolution Neurale &amp; Autonomie IA</h1>  
<div class="flex w-12 items-center justify-end">  
<button class="flex max-w-[480px] cursor-pointer items-center justify-center overflow-hidden rounded-lg h-12 bg-transparent text-gray-800 dark:text-white gap-2 text-base font-bold leading-normal tracking-[0.015em] min-w-0 p-0">  
<span class="material-symbols-outlined" style="font-size: 24px;">settings</span>  
</button>  
</div>  
</div>  
<main class="flex-1 px-4">  
<h2 class="text-gray-900 dark:text-white text-lg font-bold leading-tight tracking-[-0.015em] pt-4 pb-2">Votre Symbiose Actuelle</h2>  
<div class="flex flex-col gap-3 p-4 bg-gray-100 dark:bg-black/20 rounded-xl">  
<div class="flex gap-6 justify-between">  
<p class="text-gray-800 dark:text-white text-base font-medium leading-normal">Intégration</p>  
<p class="text-primary text-sm font-bold leading-normal">42%</p>  
</div>  
<div class="rounded-full bg-gray-300 dark:bg-gray-700/50">  
<div class="h-2 rounded-full bg-primary" style="width: 42%;"></div>  
</div>  
<p class="text-gray-500 dark:text-gray-400 text-sm font-normal leading-normal">Stade 2 : Assistance Augmentée</p>  
</div>  
<h2 class="text-gray-900 dark:text-white text-lg font-bold leading-tight tracking-[-0.015em] pt-8 pb-2">Projection Homo Technolocus</h2>  
<div class="relative flex flex-col gap-4 bg-gradient-to-br from-primary/10 to-transparent dark:from-primary/20 dark:to-transparent p-4 rounded-xl border border-primary/20">  
<div class="absolute top-4 right-4 flex items-center gap-1 text-primary text-xs font-medium">  
<span class="material-symbols-outlined text-sm">auto_awesome</span>  
<span>BÉNÉFICES FUTURS</span>  
</div>  
<div class="flex items-start gap-4">  
<div class="text-primary flex items-center justify-center rounded-lg bg-primary/20 shrink-0 size-10 mt-1">  
<span class="material-symbols-outlined">health_and_safety</span>  
</div>  
<div>  
<p class="text-gray-900 dark:text-white text-base font-medium leading-normal">Santé et Bien-être Avancés</p>  
<p class="text-gray-500 dark:text-gray-400 text-sm">Prévention proactive des maladies et optimisation de la longévité.</p>  
</div>  
</div>  
<div class="flex items-start gap-4">  
<div class="text-primary flex items-center justify-center rounded-lg bg-primary/20 shrink-0 size-10 mt-1">  
<span class="material-symbols-outlined">psychology</span>  
</div>  
<div>  
<p class="text-gray-900 dark:text-white text-base font-medium leading-normal">Capacités Cognitives Améliorées</p>  
<p class="text-gray-500 dark:text-gray-400 text-sm">Apprentissage accéléré et résolution de problèmes complexes.</p>  
</div>  
</div>  
<div class="flex items-start gap-4">  
<div class="text-primary flex items-center justify-center rounded-lg bg-primary/20 shrink-0 size-10 mt-1">  
<span class="material-symbols-outlined">rocket_launch</span>  
</div>  
<div>  
<p class="text-gray-900 dark:text-white text-base font-medium leading-normal">Voyages &amp; Exploration Sécurisés</p>  
<p class="text-gray-500 dark:text-gray-400 text-sm">Réduction des risques grâce à une symbiose homme-machine.</p>  
</div>  
</div>  
</div>  
<h2 class="text-gray-900 dark:text-white text-lg font-bold leading-tight tracking-[-0.015em] pt-8 pb-2">Feuille de Route Personnalisée</h2>  
<div class="flex items-center gap-4 bg-gray-100 dark:bg-black/20 p-4 rounded-xl">  
<div class="text-primary flex items-center justify-center rounded-lg bg-primary/20 shrink-0 size-12">  
<span class="material-symbols-outlined text-3xl">hub</span>  
</div>  
<div class="flex-1">  
<p class="text-gray-900 dark:text-white text-base font-medium leading-normal">Votre chemin vers l'avenir</p>  
<p class="text-gray-500 dark:text-gray-400 text-sm">L'IA a généré une feuille de route adaptée à vos objectifs.</p>  
</div>  
<span class="material-symbols-outlined text-gray-500 dark:text-gray-400">chevron_right</span>  
</div>  
<h2 class="text-gray-900 dark:text-white text-lg font-bold leading-tight tracking-[-0.015em] pt-8 pb-2">Témoignages Futuristes</h2>  
<div class="relative p-4 bg-gray-100 dark:bg-black/20 rounded-xl">  
<div class="absolute top-4 right-4 flex items-center gap-1 text-primary/70 dark:text-primary/50 text-xs font-medium">  
<span class="material-symbols-outlined text-sm">history_edu</span>  
<span>SIMULATION</span>  
</div>  
<div class="flex items-center gap-3 mb-3">  
<div class="size-10 rounded-full bg-gradient-to-br from-primary to-blue-400 flex items-center justify-center text-white shrink-0">  
<span class="material-symbols-outlined">travel_explore</span>  
</div>  
<div>  
<p class="text-gray-900 dark:text-white text-base font-medium leading-normal">Dr. Elara Vance</p>  
<p class="text-gray-500 dark:text-gray-400 text-sm">Exploratrice Spatiale, 2077</p>  
</div>  
</div>  
<p class="text-gray-600 dark:text-gray-300 text-sm italic">"Mon lien neural avec l'IA du vaisseau m'a permis d'anticiper une pluie de micrométéorites. C'était plus qu'un outil, c'était un sixième sens. Nous ne faisons qu'un."</p>  
</div>  
<div class="h-24"></div>  
</main>  
<div class="fixed bottom-0 left-0 right-0 bg-background-light/80 dark:bg-background-dark/80 backdrop-blur-lg border-t border-gray-200 dark:border-white/10">  
<div class="flex justify-around items-center h-20 px-4">  
<a class="flex flex-col items-center gap-1 text-gray-500 dark:text-gray-400" href="#">  
<span class="material-symbols-outlined">dashboard</span>  
<span class="text-xs">Dashboard</span>  
</a>  
<a class="flex flex-col items-center gap-1 text-primary" href="#">  
<span class="material-symbols-outlined">neurology</span>  
<span class="text-xs font-bold">Évolution</span>  
</a>  
<a class="flex flex-col items-center gap-1 text-gray-500 dark:text-gray-400" href="#">  
<span class="material-symbols-outlined">monitoring</span>  
<span class="text-xs">Visualisation</span>  
</a>  
<a class="flex flex-col items-center gap-1 text-gray-500 dark:text-gray-400" href="#">  
<span class="material-symbols-outlined">account_circle</span>  
<span class="text-xs">Profil</span>  
</a>  
</div>  
</div>  
</div>  </body></html><!DOCTYPE html>  <html class="dark" lang="fr"><head>  
<meta charset="utf-8"/>  
<meta content="width=device-width, initial-scale=1.0" name="viewport"/>  
<title>Évolution Neurale &amp; Autonomie IA</title>  
<script src="https://cdn.tailwindcss.com?plugins=forms,container-queries"></script>  
<link href="https://fonts.googleapis.com/css2?family=Space+Grotesk:wght@400;500;700&amp;display=swap" rel="stylesheet"/>  
<link href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined" rel="stylesheet"/>  
<script>  
        tailwind.config = {  
            darkMode: "class",  
            theme: {  
                extend: {  
                    colors: {  
                        "primary": "#1313ec",  
                        "background-light": "#f6f6f8",  
                        "background-dark": "#101022",  
                    },  
                    fontFamily: {  
                        "display": ["Space Grotesk", "sans-serif"]  
                    },  
                    borderRadius: {  
                        "DEFAULT": "0.25rem",  
                        "lg": "0.5rem",  
                        "xl": "0.75rem",  
                        "full": "9999px"  
                    },  
                },  
            },  
        }  
    </script>  
<style>  
        .material-symbols-outlined {  
            font-variation-settings:  
                'FILL' 0,  
                'wght' 400,  
                'GRAD' 0,  
                'opsz' 24  
        }  
    </style>  
<style>  
    body {  
      min-height: max(884px, 100dvh);  
    }  
  </style>  
  </head>  
<body class="bg-background-light dark:bg-background-dark font-display">  
<div class="relative flex h-auto min-h-screen w-full flex-col bg-background-light dark:bg-background-dark overflow-x-hidden">  
<!-- Top App Bar -->  
<div class="flex items-center bg-background-light dark:bg-background-dark p-4 pb-2 justify-between sticky top-0 z-10">  
<div class="flex size-12 shrink-0 items-center justify-start">  
<span class="material-symbols-outlined text-gray-800 dark:text-white" style="font-size: 24px;">arrow_back</span>  
</div>  
<h1 class="text-gray-900 dark:text-white text-lg font-bold leading-tight tracking-[-0.015em] flex-1 text-center">Évolution Neurale &amp; Autonomie IA</h1>  
<div class="flex w-12 items-center justify-end">  
<button class="flex max-w-[480px] cursor-pointer items-center justify-center overflow-hidden rounded-lg h-12 bg-transparent text-gray-800 dark:text-white gap-2 text-base font-bold leading-normal tracking-[0.015em] min-w-0 p-0">  
<span class="material-symbols-outlined" style="font-size: 24px;">settings</span>  
</button>  
</div>  
</div>  
<main class="flex-1 px-4">  
<!-- Section: Votre Symbiose Actuelle -->  
<h2 class="text-gray-900 dark:text-white text-lg font-bold leading-tight tracking-[-0.015em] pt-4 pb-2">Votre Symbiose Actuelle</h2>  
<div class="flex flex-col gap-3 p-4 bg-gray-100 dark:bg-black/20 rounded-xl">  
<div class="flex gap-6 justify-between">  
<p class="text-gray-800 dark:text-white text-base font-medium leading-normal">Intégration</p>  
<p class="text-primary text-sm font-bold leading-normal">42%</p>  
</div>  
<div class="rounded-full bg-gray-300 dark:bg-gray-700/50">  
<div class="h-2 rounded-full bg-primary" style="width: 42%;"></div>  
</div>  
<p class="text-gray-500 dark:text-gray-400 text-sm font-normal leading-normal">Stade 2 : Assistance Augmentée</p>  
</div>  
<!-- Section: Moniteur d'Intégration -->  
<h2 class="text-gray-900 dark:text-white text-lg font-bold leading-tight tracking-[-0.015em] pt-8 pb-2">Moniteur d'Intégration</h2>  
<div class="grid grid-cols-3 gap-3">  
<div class="flex flex-col items-center justify-center gap-2 p-3 bg-gray-100 dark:bg-black/20 rounded-xl text-center">  
<span class="material-symbols-outlined text-primary text-2xl">timer</span>  
<p class="text-gray-900 dark:text-white text-sm font-medium">Latence</p>  
<p class="text-gray-500 dark:text-gray-400 text-xs">8ms</p>  
</div>  
<div class="flex flex-col items-center justify-center gap-2 p-3 bg-gray-100 dark:bg-black/20 rounded-xl text-center">  
<span class="material-symbols-outlined text-primary text-2xl">target</span>  
<p class="text-gray-900 dark:text-white text-sm font-medium">Précision IA</p>  
<p class="text-gray-500 dark:text-gray-400 text-xs">99.7%</p>  
</div>  
<div class="flex flex-col items-center justify-center gap-2 p-3 bg-gray-100 dark:bg-black/20 rounded-xl text-center">  
<span class="material-symbols-outlined text-primary text-2xl">neurology</span>  
<p class="text-gray-900 dark:text-white text-sm font-medium">Charge Cognitive</p>  
<p class="text-gray-500 dark:text-gray-400 text-xs">-15%</p>  
</div>  
</div>  
<!-- Section: Délégation à l'IA -->  
<h2 class="text-gray-900 dark:text-white text-lg font-bold leading-tight tracking-[-0.015em] pt-8 pb-2">Délégation à l'IA</h2>  
<div class="flex flex-col gap-1">  
<div class="flex items-center gap-4 bg-gray-100 dark:bg-black/20 px-4 min-h-[64px] justify-between rounded-xl">  
<div class="flex items-center gap-4">  
<div class="text-gray-800 dark:text-white flex items-center justify-center rounded-lg bg-gray-200 dark:bg-gray-700/50 shrink-0 size-10">  
<span class="material-symbols-outlined" style="font-size: 24px;">analytics</span>  
</div>  
<p class="text-gray-900 dark:text-white text-base font-normal leading-normal flex-1 truncate">Analyse de données</p>  
</div>  
<div class="shrink-0">  
<label class="relative flex h-[31px] w-[51px] cursor-pointer items-center rounded-full border-none bg-gray-300 dark:bg-gray-700/50 p-0.5 has-[:checked]:justify-end has-[:checked]:bg-primary">  
<div class="h-full w-[27px] rounded-full bg-white" style="box-shadow: rgba(0, 0, 0, 0.15) 0px 3px 8px, rgba(0, 0, 0, 0.06) 0px 3px 1px;"></div>  
<input checked="" class="invisible absolute" type="checkbox"/>  
</label>  
</div>  
</div>  
<div class="flex items-center gap-4 bg-gray-100 dark:bg-black/20 px-4 min-h-[64px] justify-between rounded-xl">  
<div class="flex items-center gap-4">  
<div class="text-gray-800 dark:text-white flex items-center justify-center rounded-lg bg-gray-200 dark:bg-gray-700/50 shrink-0 size-10">  
<span class="material-symbols-outlined" style="font-size: 24px;">model_training</span>  
</div>  
<p class="text-gray-900 dark:text-white text-base font-normal leading-normal flex-1 truncate">Optimisation de paramètres</p>  
</div>  
<div class="shrink-0">  
<label class="relative flex h-[31px] w-[51px] cursor-pointer items-center rounded-full border-none bg-gray-300 dark:bg-gray-700/50 p-0.5 has-[:checked]:justify-end has-[:checked]:bg-primary">  
<div class="h-full w-[27px] rounded-full bg-white" style="box-shadow: rgba(0, 0, 0, 0.15) 0px 3px 8px, rgba(0, 0, 0, 0.06) 0px 3px 1px;"></div>  
<input class="invisible absolute" type="checkbox"/>  
</label>  
</div>  
</div>  
<div class="flex items-center gap-4 bg-gray-100 dark:bg-black/20 px-4 min-h-[64px] justify-between rounded-xl">  
<div class="flex items-center gap-4">  
<div class="text-gray-800 dark:text-white flex items-center justify-center rounded-lg bg-gray-200 dark:bg-gray-700/50 shrink-0 size-10">  
<span class="material-symbols-outlined" style="font-size: 24px;">online_prediction</span>  
</div>  
<p class="text-gray-900 dark:text-white text-base font-normal leading-normal flex-1 truncate">Actions prédictives</p>  
</div>  
<div class="shrink-0">  
<label class="relative flex h-[31px] w-[51px] cursor-pointer items-center rounded-full border-none bg-gray-300 dark:bg-gray-700/50 p-0.5 has-[:checked]:justify-end has-[:checked]:bg-primary">  
<div class="h-full w-[27px] rounded-full bg-white" style="box-shadow: rgba(0, 0, 0, 0.15) 0px 3px 8px, rgba(0, 0, 0, 0.06) 0px 3px 1px;"></div>  
<input checked="" class="invisible absolute" type="checkbox"/>  
</label>  
</div>  
</div>  
</div>  
<!-- Section: Prochaines Étapes -->  
<h2 class="text-gray-900 dark:text-white text-lg font-bold leading-tight tracking-[-0.015em] pt-8 pb-2">Prochaines Étapes</h2>  
<div class="flex flex-col gap-4 bg-gray-100 dark:bg-black/20 p-4 rounded-xl">  
<div class="flex items-start gap-4">  
<div class="text-primary flex items-center justify-center rounded-lg bg-primary/20 shrink-0 size-10 mt-1">  
<span class="material-symbols-outlined">psychology</span>  
</div>  
<div>  
<p class="text-gray-900 dark:text-white text-base font-medium leading-normal">Autonomie Décisionnelle</p>  
<p class="text-gray-500 dark:text-gray-400 text-sm">Débloqué à 75%. L'IA pourra prendre des décisions mineures en totale autonomie.</p>  
</div>  
</div>  
<div class="w-full h-px bg-gray-200 dark:bg-gray-700/50"></div>  
<div class="flex items-start gap-4">  
<div class="text-primary flex items-center justify-center rounded-lg bg-primary/20 shrink-0 size-10 mt-1">  
<span class="material-symbols-outlined">shield</span>  
</div>  
<div>  
<p class="text-gray-900 dark:text-white text-base font-medium leading-normal">Éthique &amp; Protection</p>  
<p class="text-gray-500 dark:text-gray-400 text-sm">Consultez notre charte sur la gouvernance des données et la confidentialité.</p>  
</div>  
</div>  
</div>  
<div class="h-24"></div>  
</main>  
<!-- Bottom Navigation Bar -->  
<div class="fixed bottom-0 left-0 right-0 bg-background-light/80 dark:bg-background-dark/80 backdrop-blur-lg border-t border-gray-200 dark:border-white/10">  
<div class="flex justify-around items-center h-20 px-4">  
<a class="flex flex-col items-center gap-1 text-gray-500 dark:text-gray-400" href="#">  
<span class="material-symbols-outlined">dashboard</span>  
<span class="text-xs">Dashboard</span>  
</a>  
<a class="flex flex-col items-center gap-1 text-primary" href="#">  
<span class="material-symbols-outlined">neurology</span>  
<span class="text-xs font-bold">Évolution</span>  
</a>  
<a class="flex flex-col items-center gap-1 text-gray-500 dark:text-gray-400" href="#">  
<span class="material-symbols-outlined">monitoring</span>  
<span class="text-xs">Visualisation</span>  
</a>  
<a class="flex flex-col items-center gap-1 text-gray-500 dark:text-gray-400" href="#">  
<span class="material-symbols-outlined">account_circle</span>  
<span class="text-xs">Profil</span>  
</a>  
</div>  
</div>  
</div>  
</body></html><!DOCTYPE html>  <html class="dark" lang="fr"><head>  
<meta charset="utf-8"/>  
<meta content="width=device-width, initial-scale=1.0" name="viewport"/>  
<title>Neural Link V1.0</title>  
<script src="https://cdn.tailwindcss.com?plugins=forms,container-queries"></script>  
<link href="https://fonts.googleapis.com/css2?family=Space+Grotesk:wght@300..700&amp;display=swap" rel="stylesheet"/>  
<link href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined" rel="stylesheet"/>  
<script>  
        tailwind.config = {  
            darkMode: "class",  
            theme: {  
                extend: {  
                    colors: {  
                        "primary": "#00BFFF",  
                        "background-light": "#f6f6f8",  
                        "background-dark": "#121212",  
                    },  
                    fontFamily: {  
                        "display": ["Space Grotesk", "sans-serif"]  
                    },  
                    borderRadius: {  
                        "DEFAULT": "0.25rem",  
                        "lg": "0.5rem",  
                        "xl": "0.75rem",  
                        "full": "9999px"  
                    },  
                    animation: {  
                        pulse: 'pulse 3s cubic-bezier(0.4, 0, 0.6, 1) infinite',  
                    },  
                    keyframes: {  
                        pulse: {  
                            '0%, 100%': {  
                                opacity: 1,  
                                transform: 'scale(1)'  
                            },  
                            '50%': {  
                                opacity: 0.7,  
                                transform: 'scale(1.05)'  
                            },  
                        },  
                    },  
                },  
            },  
        }  
    </script>  
<style>  
    body {  
      min-height: max(884px, 100dvh);  
    }  
  </style>  
<style>  
    body {  
      min-height: max(884px, 100dvh);  
    }  
  </style>  
  </head>  
<body class="bg-background-light dark:bg-background-dark font-display text-[#E0E0E0]">  
<div class="relative flex h-auto min-h-screen w-full flex-col group/design-root overflow-x-hidden">  
<div class="flex items-center p-4">  
<button class="flex size-10 shrink-0 items-center justify-center rounded-full text-[#E0E0E0] transition-colors hover:bg-white/10">  
<span class="material-symbols-outlined text-2xl">arrow_back</span>  
</button>  
<h2 class="flex-1 text-center text-xl font-bold leading-tight tracking-tight text-[#E0E0E0]">Connexion Neurale IA</h2>  
<button class="flex size-10 shrink-0 items-center justify-center rounded-full text-[#E0E0E0] transition-colors hover:bg-white/10">  
<span class="material-symbols-outlined text-2xl">menu</span>  
</button>  
</div>  
<main class="flex-grow flex flex-col items-center px-4 pt-4 pb-6">  
<div class="relative flex h-80 w-full max-w-sm flex-col items-center justify-center">  
<div class="relative flex h-64 w-64 items-center justify-center">  
<div class="absolute inset-0 animate-pulse rounded-full bg-primary/10"></div>  
<div class="absolute inset-[15%] animate-pulse rounded-full bg-primary/20 [animation-delay:-0.5s]"></div>  
<div class="absolute inset-[30%] rounded-full bg-primary/40"></div>  
<div class="absolute h-full w-full bg-contain bg-center bg-no-repeat" style='background-image: url("https://lh3.googleusercontent.com/aida-public/AB6AXuCb25AcgzB-Yxnk6OM1N9M9aXrdQMvBf1U6qjLQr45CuJQTWoPz7Cqu_msEeWBINcMG6Wl8WsT1vLDPo87XvZzPolwMzLM0DFqzRQ4mOZ-UW5yk_AMhi3b7c0oRmtc0GLR3kLfZRaIeob6HzxCy8H4vtnn3HuPUneqd-E-c1sponfM0mJ1F723qTdZK6mUeeTU277wlnFXLXQwFe_Y7XwoNr_gNhsPdNpJHcoExF_7QerDAx3xIMaJfXkkEOZCLXFaJO9sb88T6DUZI"); mix-blend-mode: screen; opacity: 0.3;'></div>  
<div class="relative z-10 flex flex-col items-center">  
<h1 class="text-[32px] font-bold leading-tight tracking-wider text-[#39FF14]">CONNECTÉ</h1>  
<p class="text-sm font-normal leading-normal text-white/70">Statut: Nominal</p>  
</div>  
</div>  
<div class="absolute bottom-0 flex w-full flex-col items-center">  
<div class="flex items-center gap-2 rounded-full border border-white/20 bg-white/5 px-4 py-1.5">  
<div class="h-2 w-2 animate-pulse rounded-full bg-[#39FF14] shadow-[0_0_8px_0_#39FF14]"></div>  
<p class="text-sm font-medium text-white/90">Statut de l'Intelligence Active: <span class="font-bold text-[#39FF14]">Proactive</span></p>  
</div>  
</div>  
</div>  
<div class="mt-8 w-full max-w-sm">  
<h3 class="mb-3 text-lg font-semibold text-white/90">Modes d'Interaction IA</h3>  
<div class="grid grid-cols-1 gap-3 sm:grid-cols-2">  
<button class="flex items-center justify-between gap-3 rounded-lg border border-primary bg-primary/10 p-3 text-left transition-all hover:bg-primary/20">  
<div>  
<p class="font-semibold text-white">Assistance Proactive</p>  
<p class="text-xs text-white/60">L'IA anticipe et assiste.</p>  
</div>  
<span class="material-symbols-outlined text-primary">check_circle</span>  
</button>  
<button class="flex items-center justify-between gap-3 rounded-lg border border-white/20 bg-white/5 p-3 text-left transition-all hover:bg-white/10">  
<div>  
<p class="font-medium text-white/80">Focus Humanitaire</p>  
<p class="text-xs text-white/60">Priorise les actions à impact.</p>  
</div>  
</button>  
<button class="flex items-center justify-between gap-3 rounded-lg border border-white/20 bg-white/5 p-3 text-left transition-all hover:bg-white/10">  
<div>  
<p class="font-medium text-white/80">Contribution Optimisée</p>  
<p class="text-xs text-white/60">Maximise l'efficacité des tâches.</p>  
</div>  
</button>  
</div>  
</div>  
<div class="mt-8 w-full max-w-sm">  
<details class="group">  
<summary class="list-none flex cursor-pointer items-center justify-between rounded-md p-2 transition-colors hover:bg-white/10">  
<h3 class="text-lg font-semibold text-white/90">Paramètres d'Optimisation IA</h3>  
<span class="material-symbols-outlined transition-transform duration-300 group-open:rotate-180">expand_more</span>  
</summary>  
<div class="mt-4 space-y-4 border-l border-white/20 pl-4 text-sm text-white/70">  
<div class="flex items-center justify-between">  
<label class="text-white/90" for="intervention-level">Niveau d'intervention</label>  
<span class="text-primary font-medium">Élevé</span>  
</div>  
<input class="h-1.5 w-full cursor-pointer appearance-none rounded-full bg-white/20 accent-primary" id="intervention-level" max="100" min="0" type="range" value="80"/>  
<div class="flex items-center justify-between">  
<label class="text-white/90" for="respect-prefs">Respect des préférences</label>  
<div class="relative inline-flex h-6 w-11 cursor-pointer items-center rounded-full">  
<input checked="" class="peer sr-only" id="respect-prefs" type="checkbox"/>  
<span class="h-full w-full rounded-full bg-white/20 peer-checked:bg-primary"></span>  
<span class="absolute left-1 top-1 h-4 w-4 rounded-full bg-white transition-all peer-checked:left-6"></span>  
</div>  
</div>  
</div>  
</details>  
</div>  
<div class="my-8 w-full max-w-sm">  
<button class="w-full rounded-lg bg-[#FF073A] py-4 px-6 font-bold text-black shadow-lg shadow-red-500/20 transition-colors hover:bg-red-700">Déconnecter</button>  
</div>  
<div class="w-full flex flex-wrap gap-4">  
<div class="flex min-w-[158px] flex-1 flex-col gap-2 rounded-xl border border-white/20 bg-white/5 p-5">  
<p class="text-base font-medium leading-normal text-[#E0E0E0]">Puissance du Signal</p>  
<p class="text-3xl font-bold leading-tight tracking-light text-[#39FF14]">98%</p>  
</div>  
<div class="flex min-w-[158px] flex-1 flex-col gap-2 rounded-xl border border-white/20 bg-white/5 p-5">  
<p class="text-base font-medium leading-normal text-[#E0E0E0]">Débit de Données</p>  
<p class="text-3xl font-bold leading-tight tracking-light text-primary">1.2 <span class="text-xl">Gbps</span></p>  
</div>  
<div class="flex min-w-[158px] flex-1 flex-col gap-2 rounded-xl border border-white/20 bg-white/5 p-5">  
<p class="text-base font-medium leading-normal text-[#E0E0E0]">Latence</p>  
<p class="text-3xl font-bold leading-tight tracking-light text-[#FFD700]">12<span class="text-xl">ms</span></p>  
</div>  
</div>  
</main>  
</div>  
</body></html><!DOCTYPE html>  <html class="dark" lang="fr"><head>  
<meta charset="utf-8"/>  
<meta content="width=device-width, initial-scale=1.0" name="viewport"/>  
<title>Projets Humanitaires - Neural Linker</title>  
<script src="https://cdn.tailwindcss.com?plugins=forms,container-queries"></script>  
<link href="https://fonts.googleapis.com" rel="preconnect"/>  
<link crossorigin="" href="https://fonts.gstatic.com" rel="preconnect"/>  
<link href="https://fonts.googleapis.com/css2?family=Space+Grotesk:wght@400;500;700&amp;display=swap" rel="stylesheet"/>  
<link href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined" rel="stylesheet"/>  
<script>  
      tailwind.config = {  
        darkMode: "class",  
        theme: {  
          extend: {  
            colors: {  
              "primary": "#1313ec",  
              "background-light": "#f6f6f8",  
              "background-dark": "#101022",  
            },  
            fontFamily: {  
              "display": ["Space Grotesk", "sans-serif"]  
            },  
            borderRadius: {"DEFAULT": "0.25rem", "lg": "0.5rem", "xl": "0.75rem", "full": "9999px"},  
          },  
        },  
      }  
    </script>  
<style>  
        .material-symbols-outlined {  
            font-variation-settings: 'FILL' 0, 'wght' 400, 'GRAD' 0, 'opsz' 24;  
        }  
    </style>  
<style>  
    body {  
      min-height: max(884px, 100dvh);  
    }  
  </style>  
  </head>  
<body class="bg-background-light dark:bg-background-dark font-display">  
<div class="relative flex h-auto min-h-screen w-full flex-col group/design-root overflow-x-hidden">  
<!-- TopAppBar -->  
<div class="flex items-center bg-background-light dark:bg-background-dark p-4 pb-2 justify-between sticky top-0 z-10">  
<div class="flex size-12 shrink-0 items-center justify-start">  
<span class="material-symbols-outlined text-gray-800 dark:text-white text-2xl">menu</span>  
</div>  
<h1 class="text-gray-900 dark:text-white text-lg font-bold leading-tight tracking-[-0.015em] flex-1 text-center">Projets Humanitaires</h1>  
<div class="flex w-12 items-center justify-end">  
<button class="flex max-w-[480px] cursor-pointer items-center justify-center overflow-hidden rounded-full h-12 bg-transparent text-gray-800 dark:text-white gap-2 text-base font-bold leading-normal tracking-[0.015em] min-w-0 p-0">  
<span class="material-symbols-outlined text-2xl">search</span>  
</button>  
</div>  
</div>  
<!-- HeadlineText -->  
<h2 class="text-gray-900 dark:text-white tracking-light text-[28px] font-bold leading-tight px-4 text-left pb-3 pt-5">Connectez votre esprit, changez le monde.</h2>  
<!-- SectionHeader: Ma Contribution -->  
<h3 class="text-gray-900 dark:text-white text-lg font-bold leading-tight tracking-[-0.015em] px-4 pb-2 pt-4">Ma Contribution</h3>  
<!-- Stats -->  
<div class="flex flex-wrap gap-4 p-4">  
<div class="flex min-w-[158px] flex-1 flex-col gap-2 rounded-lg p-4 border border-gray-200 dark:border-gray-700 bg-white dark:bg-gray-800/20">  
<p class="text-gray-600 dark:text-gray-400 text-base font-medium leading-normal">Projets Soutenus</p>  
<p class="text-gray-900 dark:text-white tracking-light text-2xl font-bold leading-tight">3</p>  
</div>  
<div class="flex min-w-[158px] flex-1 flex-col gap-2 rounded-lg p-4 border border-gray-200 dark:border-gray-700 bg-white dark:bg-gray-800/20">  
<p class="text-gray-600 dark:text-gray-400 text-base font-medium leading-normal">Données Contribuées</p>  
<p class="text-gray-900 dark:text-white tracking-light text-2xl font-bold leading-tight">1,2 Go</p>  
</div>  
<div class="flex min-w-full flex-col gap-2 rounded-lg p-4 border border-gray-200 dark:border-gray-700 bg-white dark:bg-gray-800/20">  
<div class="flex justify-between items-center">  
<p class="text-gray-600 dark:text-gray-400 text-base font-medium leading-normal">Impact Généré</p>  
<p class="text-gray-900 dark:text-white tracking-light text-xl font-bold leading-tight">7%</p>  
</div>  
<div class="w-full bg-gray-200 dark:bg-gray-700 rounded-full h-2.5 mt-2">  
<div class="bg-primary h-2.5 rounded-full" style="width: 45%"></div>  
</div>  
</div>  
</div>  
<!-- SectionHeader: Projets en cours -->  
<h3 class="text-gray-900 dark:text-white text-lg font-bold leading-tight tracking-[-0.015em] px-4 pb-2 pt-4">Découvrir les projets</h3>  
<!-- Card 1 -->  
<div class="p-4 pt-2 @container">  
<div class="flex flex-col items-stretch justify-start rounded-xl overflow-hidden shadow-sm bg-white dark:bg-[#1C1C27]">  
<div class="w-full bg-center bg-no-repeat aspect-video bg-cover" data-alt="Microscope and neural network overlay" style='background-image: url("https://lh3.googleusercontent.com/aida-public/AB6AXuCUq2i5tiTyaF52xrDJb1NAow9DbtOu0i6pVC_vLiFJuxp6yiQBE-0kIm-WWq5K_7hTL292rWwwpXAm05BqfN5YoldCK7EczZ0agsNxa6HAP7lJ91iexhupvAZvlMFUaAglDUXrZxk6ua2L1NemM_vTyWSu-gYZOVeCp5w-2-rI2PWmI0ibXjjCfBhI5uZ8s8-sXD6Yqd1w4fgN58CIQ1XW6KhbpOxWF40RJdKAwxMr862LDvQpBUKPIKr76eU-9mslDRjL170DOKoA");'></div>  
<div class="flex w-full min-w-72 grow flex-col items-stretch justify-center gap-2 p-4">  
<p class="text-primary dark:text-blue-400 text-sm font-medium leading-normal">Santé, IA, Afrique</p>  
<p class="text-gray-900 dark:text-white text-lg font-bold leading-tight tracking-[-0.015em]">Améliorer le diagnostic précoce</p>  
<p class="text-gray-600 dark:text-gray-400 text-base font-normal leading-normal">Utiliser l'IA pour détecter les maladies plus tôt et sauver des vies.</p>  
<div class="w-full bg-gray-200 dark:bg-gray-700 rounded-full h-2 my-2">  
<div class="bg-primary h-2 rounded-full" style="width: 75%"></div>  
</div>  
<p class="text-gray-500 dark:text-gray-400 text-sm font-normal leading-normal self-end">75% de l'objectif atteint</p>  
<button class="flex min-w-[84px] max-w-[480px] w-full mt-2 cursor-pointer items-center justify-center overflow-hidden rounded-lg h-10 px-4 bg-primary text-white text-sm font-medium leading-normal">  
<span class="truncate">En Savoir Plus</span>  
</button>  
</div>  
</div>  
</div>  
<!-- Card 2 -->  
<div class="p-4 pt-2 @container">  
<div class="flex flex-col items-stretch justify-start rounded-xl overflow-hidden shadow-sm bg-white dark:bg-[#1C1C27]">  
<div class="w-full bg-center bg-no-repeat aspect-video bg-cover" data-alt="Child learning on a tablet in a rural classroom" style='background-image: url("https://lh3.googleusercontent.com/aida-public/AB6AXuAAn_OfdZbPGWkX8-BoL8LvlkNioDrhsyAs1HvMRT8kg_RGOHcn_0AsG7zttqE7OwhMP0Td1xR_a08i6caG5llNwxnaEIW3Q-4dzJPPeY8JJA2uEr0SjIQPrrDJVdSh9G_h8vqryecSCnoX25nhdNB8P2XybDkrdviyM7UscujT64DZROTnu5AAuj-qcyWRRiX3NIQRpnPZ5zRgJdpFV9Y2BgbPbvBjsa5AAYSJq__u7VrXP8HFttKptn2_EAGW_vvbJYSq5dWoMNrj");'></div>  
<div class="flex w-full min-w-72 grow flex-col items-stretch justify-center gap-2 p-4">  
<p class="text-primary dark:text-blue-400 text-sm font-medium leading-normal">Éducation, IA</p>  
<p class="text-gray-900 dark:text-white text-lg font-bold leading-tight tracking-[-0.015em]">Éducation pour tous via l'IA</p>  
<p class="text-gray-600 dark:text-gray-400 text-base font-normal leading-normal">Créer des parcours d'apprentissage personnalisés pour les enfants dans les régions isolées.</p>  
<div class="w-full bg-gray-200 dark:bg-gray-700 rounded-full h-2 my-2">  
<div class="bg-primary h-2 rounded-full" style="width: 40%"></div>  
</div>  
<p class="text-gray-500 dark:text-gray-400 text-sm font-normal leading-normal self-end">40% de l'objectif atteint</p>  
<button class="flex min-w-[84px] max-w-[480px] w-full mt-2 cursor-pointer items-center justify-center overflow-hidden rounded-lg h-10 px-4 bg-primary text-white text-sm font-medium leading-normal">  
<span class="truncate">Participer</span>  
</button>  
</div>  
</div>  
</div>  
<!-- Card 3 -->  
<div class="p-4 pt-2 @container">  
<div class="flex flex-col items-stretch justify-start rounded-xl overflow-hidden shadow-sm bg-white dark:bg-[#1C1C27]">  
<div class="w-full bg-center bg-no-repeat aspect-video bg-cover" data-alt="Lush green forest with data streams" style='background-image: url("https://lh3.googleusercontent.com/aida-public/AB6AXuAqBX5slC1EvugQTmM0pOhjEEWesiU14ijvp6kuguAEu8h-EFhJHaZCoMDxj5GwVJYH5O3HECTyaJK_UQfSR8bsSreIXJnBx8QiTnFSN1pFO6pHISSPE6t8vwNbzHyleDrgsPDKvKiIepNOvH7RFl8Qh7i8lQTZx7r2iVqEBAQf7Iwq8YNiX9e4x_QuZXTuZ9cx6REfVG3My7GtB_JLHo-6iynIBtL_O3b9o_g4TlmcxH94RWdJp6K-Dcnkv7HwlD64TS3Yx0dd1rH_");'></div>  
<div class="flex w-full min-w-72 grow flex-col items-stretch justify-center gap-2 p-4">  
<p class="text-primary dark:text-blue-400 text-sm font-medium leading-normal">Environnement, Données</p>  
<p class="text-gray-900 dark:text-white text-lg font-bold leading-tight tracking-[-0.015em]">Restauration des écosystèmes</p>  
<p class="text-gray-600 dark:text-gray-400 text-base font-normal leading-normal">Analyser des données satellites pour cibler les zones prioritaires de reforestation.</p>  
<div class="w-full bg-gray-200 dark:bg-gray-700 rounded-full h-2 my-2">  
<div class="bg-primary h-2 rounded-full" style="width: 62%"></div>  
</div>  
<p class="text-gray-500 dark:text-gray-400 text-sm font-normal leading-normal self-end">62% de l'objectif atteint</p>  
<button class="flex min-w-[84px] max-w-[480px] w-full mt-2 cursor-pointer items-center justify-center overflow-hidden rounded-lg h-10 px-4 bg-primary text-white text-sm font-medium leading-normal">  
<span class="truncate">En Savoir Plus</span>  
</button>  
</div>  
</div>  
</div>  
<div class="h-10"></div>  
<!-- Bottom Navigation Bar -->  
<div class="fixed bottom-0 left-0 right-0 h-20 bg-white/80 dark:bg-background-dark/80 backdrop-blur-lg border-t border-gray-200 dark:border-gray-800 flex justify-around items-center">  
<a class="flex flex-col items-center text-gray-500 dark:text-gray-400" href="#">  
<span class="material-symbols-outlined">home</span>  
<span class="text-xs">Accueil</span>  
</a>  
<a class="flex flex-col items-center text-primary dark:text-blue-400" href="#">  
<span class="material-symbols-outlined">volunteer_activism</span>  
<span class="text-xs font-bold">Projets</span>  
</a>  
<a class="flex flex-col items-center text-gray-500 dark:text-gray-400" href="#">  
<span class="material-symbols-outlined">monitoring</span>  
<span class="text-xs">Données</span>  
</a>  
<a class="flex flex-col items-center text-gray-500 dark:text-gray-400" href="#">  
<span class="material-symbols-outlined">person</span>  
<span class="text-xs">Profil</span>  
</a>  
</div>  
</div>  
</body></html><!DOCTYPE html>  <html class="dark" lang="en"><head>  
<meta charset="utf-8"/>  
<meta content="width=device-width, initial-scale=1.0" name="viewport"/>  
<title>Neural Linker V1.0 Dashboard</title>  
<script src="https://cdn.tailwindcss.com?plugins=forms,container-queries"></script>  
<link href="https://fonts.googleapis.com" rel="preconnect"/>  
<link crossorigin="" href="https://fonts.gstatic.com" rel="preconnect"/>  
<link href="https://fonts.googleapis.com/css2?family=Space+Grotesk:wght@400;500;700&amp;display=swap" rel="stylesheet"/>  
<link href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined" rel="stylesheet"/>  
<script>  
    tailwind.config = {  
      darkMode: "class",  
      theme: {  
        extend: {  
          colors: {  
            "primary": "#00FFFF",  
            "background-light": "#f6f6f8",  
            "background-dark": "#0A192F",  
            "surface-dark": "#172A45",  
            "text-primary-dark": "#E6F1FF",  
            "text-secondary-dark": "#8892B0",  
            "accent-green": "#39FF14",  
          },  
          fontFamily: {  
            "display": ["Space Grotesk", "sans-serif"]  
          },  
          borderRadius: {  
            "DEFAULT": "0.25rem",  
            "lg": "0.5rem",  
            "xl": "0.75rem",  
            "full": "9999px"  
          },  
        },  
      },  
    }  
  </script>  
<style>  
    .material-symbols-outlined {  
      font-variation-settings: 'FILL' 0, 'wght' 300, 'GRAD' 0, 'opsz' 24;  
      font-size: 24px;  
    }  
  </style>  
<style>  
    body {  
      min-height: max(884px, 100dvh);  
    }  
  </style>  
<style>  
    body {  
      min-height: max(884px, 100dvh);  
    }  
  </style>  
  </head>  
<body class="bg-background-light dark:bg-background-dark font-display">  
<div class="relative flex h-auto min-h-screen w-full flex-col group/design-root overflow-x-hidden">  
<div class="sticky top-0 z-10 flex items-center bg-background-light/80 dark:bg-background-dark/80 p-4 backdrop-blur-sm justify-between">  
<div class="flex size-12 shrink-0 items-center justify-start">  
<span class="material-symbols-outlined text-text-primary-dark">neurology</span>  
</div>  
<h2 class="text-text-primary-dark text-lg font-bold leading-tight tracking-[-0.015em] flex-1 text-center">Neural Linker</h2>  
<div class="flex w-12 items-center justify-end">  
<button class="flex max-w-[480px] cursor-pointer items-center justify-center overflow-hidden rounded-full h-10 w-10 text-text-primary-dark gap-2 text-base font-bold leading-normal tracking-[0.015em]">  
<span class="material-symbols-outlined">account_circle</span>  
</button>  
</div>  
</div>  
<main class="flex-1 pb-24 px-4">  
<div class="flex flex-col gap-4 py-4">  
<div class="flex items-center gap-2">  
<span class="material-symbols-outlined text-primary">volunteer_activism</span>  
<h3 class="text-text-primary-dark text-lg font-bold leading-tight tracking-[-0.015em]">Humanitarian Impact</h3>  
</div>  
<div class="flex flex-col gap-4 rounded-xl border border-primary/20 bg-surface-dark/50 p-4">  
<p class="text-text-secondary-dark text-sm leading-relaxed">Our mission: advancing neural technology to empower humanity. Here's a glimpse of the lives we're changing together.</p>  
<div class="grid grid-cols-2 gap-4">  
<div class="flex flex-col gap-1 rounded-lg bg-background-dark/50 p-3 border border-primary/10">  
<p class="text-text-secondary-dark text-xs font-medium">Rehabilitation</p>  
<div class="flex items-baseline gap-1">  
<p class="text-primary tracking-light text-xl font-bold">85%</p>  
<p class="text-accent-green text-xs">+5%</p>  
</div>  
<p class="text-text-secondary-dark text-xs">Improved motor function</p>  
</div>  
<div class="flex flex-col gap-1 rounded-lg bg-background-dark/50 p-3 border border-primary/10">  
<p class="text-text-secondary-dark text-xs font-medium">Communication</p>  
<div class="flex items-baseline gap-1">  
<p class="text-primary tracking-light text-xl font-bold">1,200+</p>  
</div>  
<p class="text-text-secondary-dark text-xs">New voices enabled</p>  
</div>  
</div>  
<div class="border-t border-primary/10 pt-4">  
<p class="text-text-primary-dark font-medium text-sm mb-2">Impact Story</p>  
<blockquote class="border-l-2 border-primary pl-3">  
<p class="text-text-secondary-dark text-sm italic">"For the first time in years, I could communicate with my family seamlessly. This technology gave me back my voice."</p>  
<cite class="text-right block text-text-secondary-dark/80 text-xs not-italic mt-2">- Anonymous User</cite>  
</blockquote>  
</div>  
</div>  
</div>  
<div class="flex flex-col items-stretch justify-start rounded-xl bg-surface-dark/50 border border-primary/20">  
<div class="w-full bg-center bg-no-repeat aspect-[2/1] bg-cover rounded-t-xl" data-alt="Abstract visualization of neural pathways with glowing blue and cyan lines on a dark background." style='background-image: url("https://lh3.googleusercontent.com/aida-public/AB6AXuCYLVIEkQYl81ugD-mSkVkAYNtW69bWFqgQKd13Ji2vHgVG_ZoLRjHdl0a1MQfx667GEbjaoNy-I3pTArQTVQXNnj_pMgSTor3fXzCLLkRyLnbG5L_v8qrSDM0uIAMnfH-RuHmoE6cpJ5IXVwM9_rcXJNIotiFabJiJofxAntPcar-ALncUOZsDRKMq17_wWDgtbfcUgqMp8kJz62azC9xOOpS5I9VxCdrsNAk3nPxJI2EIoJXwwULg4jci8xi2CBAI7kY46eW27unh"); background-position: center 40%;'></div>  
<div class="flex w-full min-w-72 grow flex-col items-stretch justify-center gap-2 p-4">  
<p class="text-text-secondary-dark text-sm font-normal leading-normal">System Status</p>  
<div class="flex items-center gap-2">  
<div class="w-3 h-3 rounded-full bg-accent-green animate-pulse"></div>  
<p class="text-text-primary-dark text-lg font-bold leading-tight tracking-[-0.015em]">All Systems Nominal</p>  
</div>  
<p class="text-text-secondary-dark text-base font-normal leading-normal">Real-time data synchronization is active and stable.</p>  
</div>  
<div class="flex flex-wrap gap-4 p-4 pt-0">  
<div class="flex min-w-[120px] flex-1 flex-col gap-1 rounded-lg p-4 bg-background-dark/50 border border-primary/10">  
<p class="text-text-secondary-dark text-sm font-medium leading-normal">Active Links</p>  
<p class="text-primary tracking-light text-2xl font-bold leading-tight">42</p>  
</div>  
<div class="flex min-w-[120px] flex-1 flex-col gap-1 rounded-lg p-4 bg-background-dark/50 border border-primary/10">  
<p class="text-text-secondary-dark text-sm font-medium leading-normal">Data Throughput</p>  
<p class="text-primary tracking-light text-2xl font-bold leading-tight">12.8 Gb/s</p>  
</div>  
<div class="flex min-w-[120px] flex-1 flex-col gap-1 rounded-lg p-4 bg-background-dark/50 border border-primary/10">  
<p class="text-text-secondary-dark text-sm font-medium leading-normal">Latency</p>  
<p class="text-primary tracking-light text-2xl font-bold leading-tight">3ms</p>  
</div>  
</div>  
</div>  
<div class="flex flex-wrap gap-4 py-6">  
<div class="flex w-full flex-col gap-4 rounded-xl border border-primary/20 bg-surface-dark/50 p-4">  
<div>  
<p class="text-text-primary-dark text-base font-medium leading-normal">Real-time Neural Activity</p>  
<div class="flex items-baseline gap-2">  
<p class="text-primary tracking-light text-[32px] font-bold leading-tight truncate">78%</p>  
<p class="text-accent-green text-base font-medium leading-normal">+3.2%</p>  
</div>  
</div>  
<div class="flex gap-3 overflow-x-auto pb-2">  
<button class="flex h-8 shrink-0 items-center justify-center gap-x-2 rounded-lg bg-primary/20 px-4"><p class="text-primary text-sm font-medium leading-normal">1H</p></button>  
<button class="flex h-8 shrink-0 items-center justify-center gap-x-2 rounded-lg bg-background-dark px-4"><p class="text-text-primary-dark text-sm font-medium leading-normal">24H</p></button>  
<button class="flex h-8 shrink-0 items-center justify-center gap-x-2 rounded-lg bg-background-dark px-4"><p class="text-text-primary-dark text-sm font-medium leading-normal">7D</p></button>  
<button class="flex h-8 shrink-0 items-center justify-center gap-x-2 rounded-lg bg-background-dark px-4"><p class="text-text-primary-dark text-sm font-medium leading-normal">30D</p></button>  
</div>  
<div class="flex min-h-[180px] flex-1 flex-col gap-8 py-4">  
<svg fill="none" height="148" preserveAspectRatio="none" viewBox="-3 0 478 150" width="100%" xmlns="http://www.w3.org/2000/svg">  
<path d="M0 109C18.1538 109 18.1538 21 36.3077 21C54.4615 21 54.4615 41 72.6154 41C90.7692 41 90.7692 93 108.923 93C127.077 93 127.077 33 145.231 33C163.385 33 163.385 101 181.538 101C199.692 101 199.692 61 217.846 61C236 61 236 45 254.154 45C272.308 45 272.308 121 290.462 121C308.615 121 308.615 149 326.769 149C344.923 149 344.923 1 363.077 1C381.231 1 381.231 81 399.385 81C417.538 81 417.538 129 435.692 129C453.846 129 453.846 25 472 25V149H0V109Z" fill="url(#paint0_linear_chart)"></path>  
<path d="M0 109C18.1538 109 18.1538 21 36.3077 21C54.4615 21 54.4615 41 72.6154 41C90.7692 41 90.7692 93 108.923 93C127.077 93 127.077 33 145.231 33C163.385 33 163.385 101 181.538 101C199.692 101 199.692 61 217.846 61C236 61 236 45 254.154 45C272.308 45 272.308 121 290.462 121C308.615 121 308.615 149 326.769 149C344.923 149 344.923 1 363.077 1C381.231 1 381.231 81 399.385 81C417.538 81 417.538 129 435.692 129C453.846 129 453.846 25 472 25" stroke="#00FFFF" stroke-linecap="round" stroke-width="3"></path>  
<defs>  
<linearGradient gradientUnits="userSpaceOnUse" id="paint0_linear_chart" x1="236" x2="236" y1="1" y2="149">  
<stop stop-color="#00FFFF" stop-opacity="0.3"></stop>  
<stop offset="1" stop-color="#00FFFF" stop-opacity="0"></stop>  
</linearGradient>  
</defs>  
</svg>  
</div>  
</div>  
</div>  
<div class="grid grid-cols-3 gap-4 pb-6">  
<button class="flex flex-col items-center gap-2 rounded-xl p-4 bg-surface-dark/50 border border-primary/20">  
<span class="material-symbols-outlined text-primary text-3xl">biotech</span>  
<span class="text-text-primary-dark text-xs font-medium">Diagnostics</span>  
</button>  
<button class="flex flex-col items-center gap-2 rounded-xl p-4 bg-surface-dark/50 border border-primary/20">  
<span class="material-symbols-outlined text-primary text-3xl">add_circle</span>  
<span class="text-text-primary-dark text-xs font-medium">New Session</span>  
</button>  
<button class="flex flex-col items-center gap-2 rounded-xl p-4 bg-surface-dark/50 border border-primary/20">  
<span class="material-symbols-outlined text-primary text-3xl">notifications_active</span>  
<span class="text-text-primary-dark text-xs font-medium">View Alerts</span>  
</button>  
</div>  
<div class="flex flex-col gap-4">  
<h3 class="text-text-primary-dark text-lg font-bold leading-tight tracking-[-0.015em]">Active Networks</h3>  
<ul class="flex flex-col gap-3">  
<li class="flex items-center gap-4 rounded-xl p-4 bg-surface-dark/50 border border-primary/10">  
<div class="flex items-center justify-center p-2 rounded-full bg-primary/20">  
<span class="material-symbols-outlined text-primary">hub</span>  
</div>  
<div class="flex-1">  
<p class="text-text-primary-dark font-medium">Cortex-A78 Link</p>  
<p class="text-text-secondary-dark text-sm">Real-time Analysis</p>  
</div>  
<div class="w-1/3">  
<svg class="w-full h-auto" viewBox="0 0 100 30">  
<path d="M 0 20 C 10 20, 15 5, 25 15 S 40 28, 50 20 S 65 5, 75 12 S 90 25, 100 22" fill="none" stroke="#39FF14" stroke-linecap="round" stroke-width="2"></path>  
</svg>  
</div>  
<div class="w-2.5 h-2.5 rounded-full bg-accent-green"></div>  
</li>  
<li class="flex items-center gap-4 rounded-xl p-4 bg-surface-dark/50 border border-primary/10">  
<div class="flex items-center justify-center p-2 rounded-full bg-primary/20">  
<span class="material-symbols-outlined text-primary">memory</span>  
</div>  
<div class="flex-1">  
<p class="text-text-primary-dark font-medium">Hippocampus Stream</p>  
<p class="text-text-secondary-dark text-sm">Memory Recall</p>  
</div>  
<div class="w-1/3">  
<svg class="w-full h-auto" viewBox="0 0 100 30">  
<path d="M 0 10 C 10 10, 15 25, 25 18 S 40 5, 50 10 S 65 20, 75 15 S 90 8, 100 12" fill="none" stroke="#00FFFF" stroke-linecap="round" stroke-width="2"></path>  
</svg>  
</div>  
<div class="w-2.5 h-2.5 rounded-full bg-accent-green"></div>  
</li>  
<li class="flex items-center gap-4 rounded-xl p-4 bg-surface-dark/50 border border-primary/10">  
<div class="flex items-center justify-center p-2 rounded-full bg-primary/20">  
<span class="material-symbols-outlined text-primary">psychology</span>  
</div>  
<div class="flex-1">  
<p class="text-text-primary-dark font-medium">Lobe-Motor Sync</p>  
<p class="text-text-secondary-dark text-sm">Standby</p>  
</div>  
<div class="w-1/3">  
<svg class="w-full h-auto" viewBox="0 0 100 30">  
<path d="M 0 15 C 20 15, 40 15, 60 15 L 100 15" fill="none" stroke="#8892B0" stroke-linecap="round" stroke-width="2"></path>  
</svg>  
</div>  
<div class="w-2.5 h-2.5 rounded-full bg-yellow-400"></div>  
</li>  
</ul>  
</div>  
</main>  
<div class="fixed bottom-0 left-0 right-0 z-10 bg-background-light/80 dark:bg-background-dark/80 backdrop-blur-sm border-t border-primary/20">  
<div class="flex justify-around p-2">  
<button class="flex flex-col items-center justify-center gap-1 p-2 rounded-lg w-20 text-primary">  
<span class="material-symbols-outlined">dashboard</span>  
<span class="text-xs font-bold">Dashboard</span>  
</button>  
<button class="flex flex-col items-center justify-center gap-1 p-2 rounded-lg w-20 text-text-secondary-dark">  
<span class="material-symbols-outlined">hub</span>  
<span class="text-xs font-medium">Networks</span>  
</button>  
<button class="flex flex-col items-center justify-center gap-1 p-2 rounded-lg w-20 text-text-secondary-dark">  
<span class="material-symbols-outlined">analytics</span>  
<span class="text-xs font-medium">Analytics</span>  
</button>  
<button class="flex flex-col items-center justify-center gap-1 p-2 rounded-lg w-20 text-text-secondary-dark">  
<span class="material-symbols-outlined">settings</span>  
<span class="text-xs font-medium">Settings</span>  
</button>  
</div>  
</div>  
</div>  </body></html><!DOCTYPE html>  <html class="dark" lang="fr"><head>  
<meta charset="utf-8"/>  
<meta content="width=device-width, initial-scale=1.0" name="viewport"/>  
<title>Neural Link V1.0 - Connexion IA</title>  
<script src="https://cdn.tailwindcss.com?plugins=forms,container-queries"></script>  
<link href="https://fonts.googleapis.com/css2?family=Space+Grotesk:wght@300..700&amp;display=swap" rel="stylesheet"/>  
<link href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined" rel="stylesheet"/>  
<script>  
    tailwind.config = {  
      darkMode: "class",  
      theme: {  
        extend: {  
          colors: {  
            "primary": "#00BFFF",  
            "background-light": "#f6f6f8",  
            "background-dark": "#121212",  
          },  
          fontFamily: {  
            "display": ["Space Grotesk", "sans-serif"]  
          },  
          borderRadius: {  
            "DEFAULT": "0.25rem",  
            "lg": "0.5rem",  
            "xl": "0.75rem",  
            "full": "9999px"  
          },  
          animation: {  
            pulse: 'pulse 3s cubic-bezier(0.4, 0, 0.6, 1) infinite',  
          },  
          keyframes: {  
            pulse: {  
              '0%, 100%': {  
                opacity: 1,  
                transform: 'scale(1)'  
              },  
              '50%': {  
                opacity: 0.7,  
                transform: 'scale(1.05)'  
              },  
            },  
          },  
        },  
      },  
    }  
  </script>  
<style>  
    body {  
      min-height: max(884px, 100dvh);  
    }  
    .waveform {  
      position: relative;  
      width: 100%;  
      height: 60px;  
      background: linear-gradient(90deg, rgba(0, 191, 255, 0) 0%, rgba(0, 191, 255, 0.2) 50%, rgba(0, 191, 255, 0) 100%);  
      overflow: hidden;  
    }  
    .waveform path {  
      stroke: #00BFFF;  
      stroke-width: 2;  
      fill: none;  
      animation: wave 2s linear infinite;  
    }  
    @keyframes wave {  
      0% {  
        transform: translateX(-50%);  
      }  
      100% {  
        transform: translateX(0);  
      }  
    }  
  </style>  
<style>  
    body {  
      min-height: max(884px, 100dvh);  
    }  
  </style>  
  </head>  
<body class="bg-background-light dark:bg-background-dark font-display text-[#E0E0E0]">  
<div class="relative flex h-auto min-h-screen w-full flex-col group/design-root overflow-x-hidden">  
<div class="flex items-center p-4">  
<button class="text-[#E0E0E0] flex size-10 shrink-0 items-center justify-center rounded-full hover:bg-white/10 transition-colors">  
<span class="material-symbols-outlined text-2xl">arrow_back</span>  
</button>  
<h2 class="text-[#E0E0E0] text-xl font-bold leading-tight tracking-tight flex-1 text-center">Machine Neural Connection</h2>  
<button class="text-[#E0E0E0] flex size-10 shrink-0 items-center justify-center rounded-full hover:bg-white/10 transition-colors">  
<span class="material-symbols-outlined text-2xl">menu</span>  
</button>  
</div>  
<main class="flex-grow flex flex-col items-center px-4 pt-8 pb-6">  
<div class="w-full max-w-sm mb-8">  
<div class="flex items-center justify-between rounded-lg border border-white/20 p-3 bg-white/5">  
<div class="flex flex-col">  
<span class="text-xs text-white/50">APPAREIL CONNECTÉ</span>  
<span class="text-[#E0E0E0] font-medium">Casque Neural v2.1</span>  
</div>  
<button class="text-primary hover:text-white transition-colors">  
<span class="material-symbols-outlined text-3xl">expand_circle_down</span>  
</button>  
</div>  
</div>  
<div class="flex w-full grow items-center justify-center py-6 @container">  
<div class="relative flex items-center justify-center w-full aspect-square max-w-[280px]">  
<div class="absolute inset-0 bg-primary/10 rounded-full animate-pulse"></div>  
<div class="absolute inset-[15%] bg-primary/20 rounded-full animate-pulse [animation-delay:-0.5s]"></div>  
<div class="absolute inset-[30%] bg-primary/40 rounded-full"></div>  
<div class="absolute w-full h-full bg-center bg-no-repeat bg-contain" style='background-image: url("https://lh3.googleusercontent.com/aida-public/AB6AXuCb25AcgzB-Yxnk6OM1N9M9aXrdQMvBf1U6qjLQr45CuJQTWoPz7Cqu_msEeWBINcMG6Wl8WsT1vLDPo87XvZzPolwMzLM0DFqzRQ4mOZ-UW5yk_AMhi3b7c0oRmtc0GLR3kLfZRaIeob6HzxCy8H4vtnn3HuPUneqd-E-c1sponfM0mJ1F723qTdZK6mUeeTU277wlnFXLXQwFe_Y7XwoNr_gNhsPdNpJHcoExF_7QerDAx3xIMaJfXkkEOZCLXFaJO9sb88T6DUZI"); mix-blend-mode: screen; opacity: 0.3;'></div>  
<div class="relative flex flex-col items-center z-10">  
<h1 class="text-[#39FF14] tracking-wider text-[32px] font-bold leading-tight">STABLE</h1>  
<p class="text-white/70 text-sm font-normal leading-normal">Session IA Active</p>  
</div>  
</div>  
</div>  
<div class="w-full max-w-sm my-8 flex items-center justify-center gap-4">  
<button class="flex-1 flex flex-col items-center justify-center gap-2 text-white font-bold py-3 px-4 rounded-lg bg-white/10 hover:bg-white/20 transition-colors">  
<span class="material-symbols-outlined text-3xl text-primary">play_circle</span>  
<span>Démarrer Session</span>  
</button>  
<button class="flex-1 flex flex-col items-center justify-center gap-2 text-white font-bold py-3 px-4 rounded-lg bg-[#FF073A]/80 hover:bg-[#FF073A] transition-colors shadow-lg shadow-red-500/20">  
<span class="material-symbols-outlined text-3xl">stop_circle</span>  
<span>Terminer Session</span>  
</button>  
</div>  
<div class="w-full max-w-sm mb-8 rounded-xl border border-white/20 bg-white/5 p-4">  
<h3 class="text-base font-medium text-white/90 mb-3">Flux de Données Neurales</h3>  
<div class="waveform">  
<svg height="100%" width="200%" xmlns="http://www.w3.org/2000/svg">  
<path d="M0 30 Q 25 10, 50 30 T 100 30 T 150 30 T 200 30 T 250 30 T 300 30 T 350 30 T 400 30 T 450 30 T 500 30 T 550 30 T 600 30 T 650 30 T 700 30 T 750 30 T 800 30"></path>  
</svg>  
</div>  
</div>  
<div class="w-full max-w-sm">  
<details class="group" open="">  
<summary class="list-none flex items-center justify-between cursor-pointer p-2 rounded-md hover:bg-white/10 transition-colors">  
<h3 class="text-lg font-semibold text-white/90">Qualité &amp; Calibration</h3>  
<span class="material-symbols-outlined transition-transform duration-300 group-open:rotate-180">expand_more</span>  
</summary>  
<div class="mt-4 space-y-4 pl-2">  
<div class="flex items-center justify-between">  
<span class="text-white/70">Qualité de la Connexion</span>  
<span class="text-[#39FF14] font-medium">Excellente</span>  
</div>  
<div class="w-full bg-white/10 rounded-full h-2">  
<div class="bg-[#39FF14] h-2 rounded-full" style="width: 95%"></div>  
</div>  
<button class="w-full mt-2 text-primary font-bold py-3 px-6 rounded-lg border border-primary/50 hover:bg-primary/10 transition-colors flex items-center justify-center gap-2">  
<span class="material-symbols-outlined">tune</span>  
<span>LaE0E
  

